package com.example.myproject

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Login(navController: NavController){
    
    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ){
        Column(

        ){

        }
    }
    
}

/*@Composable
fun MyScreen() {
    var showToast by remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = { showToast = true }) {
            Text("Show Toast")
        }
    }

    if (showToast) {
        Toast.makeText(
            context = LocalContext.current,
            message = "Hello World!"
        ).show()
        showToast = false
    }
}*/






@Preview(showBackground = true)
@Composable
fun LoginDefaultPreview() {
    Login(rememberNavController())
}