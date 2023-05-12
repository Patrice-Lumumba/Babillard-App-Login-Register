package com.example.babillard.ecoles.filieres3IAC.informations3IAC.encadreur3IAC


/*
import android.annotation.SuppressLint
import  android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myproject.R
//import com.example.myproject.ecoles.*
import com.example.myproject.ui.theme.MyProjectTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun AddRequirementScreen(){

    val scrollState = rememberLazyListState()
    //val scaffoldState2 = rememberScaffoldState()
    Box{
        MainScreen(scrollState)
        RequirementContent(scrollState)
    }
    Scaffold(scaffoldState = rememberScaffoldState(),
        topBar = {AppTopBar()},
        drawerContent = {},
        content = {RequirementCard()},
        bottomBar = {AppBottom()})

    LazyColumn(){
        item {
            RequirementCard()

        }
    }
}

@Composable
fun AppTopBar() { //Entete
    Box(modifier = Modifier
        .height(50.dp)
        .fillMaxWidth()
        .background(color = Color.Red)){
        Row(
            modifier = Modifier.padding(start = 4.dp, top = 4.dp, end = 4.dp, bottom = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(100.dp)
        )
        {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(32.dp, 32.dp)
            ) {
                Image(imageVector = Icons.Default.ArrowBack, contentDescription ="" )
            }
            Text(
                text = "Sport",
                color = Color.White,
                style= MaterialTheme.typography.h5,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}


@Composable
fun AppBottom() { //Footer
    Box(modifier = Modifier
        .height(30.dp)
        .fillMaxWidth()
        .background(color = Color.Red))
}

@Composable
fun MainScreen(scaffoldState: LazyListState) {

    TopAppBar(
        backgroundColor = Color.White
    ) {
        Row(
            modifier = Modifier.padding(start = 4.dp, top = 4.dp, end = 4.dp, bottom = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(100.dp)
        )
        {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(32.dp, 32.dp)
            ) {
                Image(imageVector = Icons.Default.ArrowBack, contentDescription ="" )
            }
            Text(
                text = "Promotion",
                color = Color.DarkGray,
                style= MaterialTheme.typography.h5,
                modifier = Modifier.fillMaxWidth()
            )
        }

    }

}

@Composable
fun RequirementContent(scaffoldState: LazyListState) {

    RequirementCard()



}

@Composable
fun RequirementCard() {
    //Icon(painterResource(R.drawable.arrow_back) , contentDescription = "" )
    Column {

        Row(
            modifier = Modifier
                .width(100.dp)
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(painter = painterResource( com.example.myproject.R.drawable.arrow_back),
                contentDescription = null,
                modifier = Modifier
                    .height(24.dp)
                    .padding(12.dp))

            Text(text = "Sport",
                fontWeight= FontWeight.Bold,
                style=MaterialTheme.typography.h6,
                color=Color.DarkGray,
                modifier = Modifier.size(20.dp)
            )
        }



    }

}

*/