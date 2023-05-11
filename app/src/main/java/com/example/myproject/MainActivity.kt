package com.example.myproject

import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myproject.MainActivity.Companion.TAB
import com.example.myproject.ui.theme.MyProjectTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.InternalCoroutinesApi

class MainActivity : ComponentActivity() {


    companion object{
        val TAB: String = MainActivity::class.java.simpleName
    }

    private val auth by lazy{
        Firebase.auth
    }

    @InternalCoroutinesApi
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyProjectTheme {
                /*val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "Log in", builder = {
                    composable("login"){
                        Login(navController = navController)
                    }
                })*/
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color =  MaterialTheme.colors.background
                ) {
                    LoginScreen(auth)
                }

                /*Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    GoogleButton(
                        text = "Sign Up with Google",
                        loadingText = "Creating Account...",
                        onClicked = {
                            Log.d("googleButton", "Clicked")
                        }
                    )
                }*/
            }
        }
    }
}

@Composable
fun LoginScreen(auth: FirebaseAuth) {

    val context = LocalContext.current

    val focusManager = LocalFocusManager.current

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    val isEmailValid by derivedStateOf {
        Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    val isPasswordValid by derivedStateOf {
        password.length > 7
    }

    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        Text(
            text = "IUC",
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.iuc),
            contentDescription = "Logo",
            modifier = Modifier.size(150.dp)
        )

        Text(
            text = "...Enseigner l'homme dans sa globalité",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(all = 10.dp)
            ){
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text( "Votre Email")},
                    placeholder = { Text("nom.prenom@myiuc.com")},
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions(
                        onNext = {focusManager.moveFocus(FocusDirection.Down)}
                    ),
                    isError = !isEmailValid,
                    trailingIcon = {
                        if(email.isNotBlank()){
                            IconButton(onClick = {email = ""}) {
                                Icon(
                                    imageVector = Icons.Filled.Clear,
                                    contentDescription = "Clear mail"
                                )
                            }
                        }
                    }
                )

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text( "Matricule")},
                    placeholder = { Text("")},
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {focusManager.clearFocus()}
                    ),
                    isError = !isPasswordValid

                )
                Button(
                    onClick = {
                        auth.signInWithEmailAndPassword(email, password)
                            .addOnCompleteListener{
                                if (it.isSuccessful){
                                    Toast.makeText(context, "Vous avez été connecté avec succès", Toast.LENGTH_SHORT).show()
                                    Log.d(TAB, "Vous avez été connecté avec succès")
                                }else{
                                    Toast.makeText(context, "Email ou mot de passe incorrect", Toast.LENGTH_SHORT).show()
                                    Log.d(TAB, "Email ou mot de passe incorrect")
                                }
                            }
                        },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                    enabled = isEmailValid && isPasswordValid
                ) {
                    /*Text(
                        text = "Se connecter",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 16.dp
                    )*/
                }

            }
        }
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()
        ) {

        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
        LoginScreen(Firebase.auth)
}