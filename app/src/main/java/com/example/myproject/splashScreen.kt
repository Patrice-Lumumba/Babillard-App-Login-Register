package com.example.myproject

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.R

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.babillard.ecoles.MyBox
import kotlinx.coroutines.delay

@Composable
fun Screen(navController: NavHostController){


    var startAnimation by remember{
        mutableStateOf(false)
    }
    val alphaAnim = animateFloatAsState(targetValue =
    if (startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 3000
        )
    )

    LaunchedEffect(key1 = true){
        startAnimation = true
        delay(4000)
        navController.navigate("MyBox")
    }
    Splash(alpha = alphaAnim.value)
}

@Preview
@Composable
fun affichage(){
    Splash(1f)
}

@Composable
fun Splash(alpha: Float){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id =com.example.myproject.R.drawable.ic_launcher_background),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
                .alpha(alpha = alpha)
        )

        Column(modifier = Modifier

            .padding(top = 300.dp, start = 150.dp)
            .height(100.dp)
            .width(100.dp)
            .clip(RoundedCornerShape(28.dp))
        ) {
            Image(
                painter = painterResource(id = com.example.myproject.R.drawable.iuc),
                contentDescription = "My Logo",
                modifier = Modifier

            )
        }


        Text(
            text = "Babillard",
            fontSize = 70.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp)
        )
    }
}

/*
@Composable
fun Splash(alpha: Float){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id =com.example.myproject.R.drawable.ic_launcher_background),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
                .alpha(alpha = alpha)
        )


        Text(
            text = "Babillard",
            fontSize = 50.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp)
        )
    }
}
*/