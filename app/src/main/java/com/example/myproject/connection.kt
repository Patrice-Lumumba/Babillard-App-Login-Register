package com.example.babillard

import android.graphics.Color.*
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myproject.R

@Composable
fun SignUpScreen() {
    var dropdownMenuExpanded by remember{ mutableStateOf(false) }
    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.iuc),
                modifier = Modifier.width(200.dp),
                contentDescription = null,

                )
            Spacer(modifier = Modifier.height(32.dp))

            var nom by remember {
                mutableStateOf("")
            }
            var prenom by remember {
                mutableStateOf("")
            }
            var matricule by remember {
                mutableStateOf("")
            }
            TextField(
                value = nom,
                onValueChange = {
                    nom = it
                },
                label = { Text("Nom") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Red
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                value = prenom,
                onValueChange = {
                    prenom = it
                },
                label = { Text("Prénom") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Red
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(25.dp))

            TextField(
                value = matricule,
                onValueChange = {
                    matricule = it
                },
                label = { Text("matricule") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Red
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(25.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(start =20.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White ,
                    contentColor = Color.Black
                )
            ) {
                Text(text = "Connecter")
            }
        }
    }
}