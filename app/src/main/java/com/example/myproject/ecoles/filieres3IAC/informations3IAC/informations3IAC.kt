package com.example.babillard.ecoles.filieres3IAC.informations3IAC


/*
import  android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.babillard.R
import com.example.babillard.ecoles.*
import com.example.babillard.ui.theme.BabillardTheme

//import androidx.compose.material3.*



@Composable
fun MyBox2( navController : NavHostController) {

}


@Preview(showBackground = true)
@Composable
fun Preview() {
    BabillardTheme {
        MyBoxINFO3IAC()
        BombieriINFO3IAC()
        countryINFO3IAC()
        istdiINFO3IAC()
        iacINFO3IAC()
        pistiINFO3IAC()
        btnINFO3IAC()
    }
}



@Composable
fun MyBoxINFO3IAC( ) {

    Box(
        modifier = Modifier
            .fillMaxWidth(),
    ){Box(modifier = Modifier
        .size(400.dp)
        .background(color = androidx.compose.ui.graphics.Color.Red),
        contentAlignment= Alignment.TopStart
    ){

        Spacer(modifier = Modifier
            .height(150.dp)
            .padding(top = 150.dp)
        )
        Column(
            modifier = Modifier
                .padding(top = 15.dp, start = 45.dp)
                .size(516.dp)
        ) {
            Text(text = "Filieres",
                style = TextStyle(
                    color = Color.White
                )
            )
            Column(modifier = Modifier
                .padding(top = 25.dp, start = 80.dp)
                .clip(RoundedCornerShape(28.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.iac),
                    contentDescription = "My Image",
                    modifier = Modifier
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment= Alignment.BottomCenter
        ){
            Spacer(modifier = Modifier.padding(100.dp))
            Column(
                modifier = Modifier
                    .height(330.dp)
                    .fillMaxWidth()
                    .padding(top = 115.dp)
                    .size(400.dp)
            )
            {
                Column( modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,

                    ) {
                    /*  TextField()
                      Spacer(modifier = Modifier.height(20.dp))
                      Teletext2()
                      Button()*/
                }
            }


            Box(

            ){
                Column() {

                }
            }

            Box(
                modifier = Modifier
                    .size(50.dp)
                    .fillMaxSize(),
                contentAlignment= Alignment.Center
            ){
                Column(

                ) {
                    /*   TextField()
                      Spacer(modifier = Modifier.height(3.dp)
                      )
                   Teletext2()
                      Spacer(modifier = Modifier.height(3.dp))
                   Button()*/
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 310.dp)
                .background(color = androidx.compose.ui.graphics.Color.Transparent)
        ){
            Text(text ="")
        }
    }

        IconButton(onClick = {}){
            Icon(

                painter = painterResource(id = R.drawable.ic_menu_24),
                contentDescription = "My Image",
            )
        }
        Column(modifier= Modifier
            .fillMaxWidth()
            .padding(0.dp)
        ){

            /* Box(modifier = Modifier
                 .background(color = androidx.compose.ui.graphics.Color.Red)
                 .size(150.dp, 100.dp)
                 .padding(top = 100.dp, start = 17.dp)
             )*/
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 180.dp)
                .height(120.dp)
                .fillMaxWidth()
                .size(400.dp)
                .clip(RoundedCornerShape(28.dp))
                .background(color = androidx.compose.ui.graphics.Color.White),
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment= Alignment.BottomCenter
            ){
                Column(

                    modifier = Modifier
                        .height(110.dp)

                        .padding(top = 11.dp)


                        .size(330.dp)
                        .clip(RoundedCornerShape(28.dp))
                        .background(color = androidx.compose.ui.graphics.Color.LightGray),
                )
                {
                    Column( modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        countryEcoles()
                    }
                }

            }
            Column(modifier = Modifier
                .padding(top = 110.dp)
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment= Alignment.BottomCenter
                ){

                    Column(

                        modifier = Modifier
                            .height(110.dp)
                            .padding(top = 11.dp)
                            .size(330.dp)
                            .clip(RoundedCornerShape(28.dp))
                            .background(color = androidx.compose.ui.graphics.Color.LightGray),
                    )
                    {
                        BombieriEcoles()

                    }
                }


                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment= Alignment.BottomCenter

                ){
                    Column(

                        modifier = Modifier
                            .height(110.dp)
                            .padding(top = 11.dp)
                            .size(330.dp)
                            .clip(RoundedCornerShape(28.dp))
                            .background(color = androidx.compose.ui.graphics.Color.LightGray),
                    )
                    {
                        Column( modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            pistiEcoles()

                        }
                    }
                }


                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment= Alignment.BottomCenter
                ){

                    Column(

                        modifier = Modifier
                            .height(110.dp)
                            .padding(top = 11.dp)
                            .size(330.dp)
                            .clip(RoundedCornerShape(28.dp))
                            .background(color = androidx.compose.ui.graphics.Color.LightGray),
                    )
                    {
                        Column( modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            iacEcoles()
                        }
                    }

                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment= Alignment.BottomCenter
                ){

                    Column(

                        modifier = Modifier
                            .height(110.dp)
                            .padding(top = 11.dp)
                            .size(330.dp)
                            .clip(RoundedCornerShape(28.dp))
                            .background(color = androidx.compose.ui.graphics.Color.LightGray),
                    )
                    {
                        Column( modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            istdiEcoles()

                        }

                    }
                }
            }
        }
    }
}




@Composable
fun BombieriINFO3IAC(){


    Column( modifier = Modifier
        .fillMaxSize()
        .padding(start = 8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(end = 206.dp)
                .size(180.dp)
                .height(29.dp)
                .clip(RoundedCornerShape(30.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.istdi),
                contentDescription = "My Image",
                modifier = Modifier

            )

        }

    }
}


@Composable
fun countryINFO3IAC(){
    Column( modifier = Modifier
        .fillMaxSize()
        .padding(start = 8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(end = 206.dp, top = 1.dp)
                .clip(RoundedCornerShape(28.dp))
                .size(180.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.iac),
                contentDescription = "My Image",
                modifier = Modifier

            )

        }

    }
}


@Composable
fun istdiINFO3IAC(){
    Column( modifier = Modifier
        .fillMaxSize()
        .padding(start = 8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(end = 206.dp, top = 1.dp)
                .clip(RoundedCornerShape(28.dp))
                .size(180.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.istdi),
                contentDescription = "My Image",
                modifier = Modifier

            )

        }

    }
}


@Composable
fun iacINFO3IAC(){
    Column( modifier = Modifier
        .fillMaxSize()
        .padding(start = 8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(end = 206.dp, top = 1.dp)
                .clip(RoundedCornerShape(28.dp))
                .size(180.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.iac),
                contentDescription = "My Image",
                modifier = Modifier

            )

            Button(
                onClick = { /* Add button click handler */ },
                modifier = Modifier

                    .padding(start = 185.dp)
                    .padding(top = 47.dp)
                    .width(200.dp)
                    .clip(RoundedCornerShape(28.dp))

                //.background(color = Color.Green)
            ) {Text(text = "Consulter")
            }
        }

    }
}


@Composable
fun pistiINFO3IAC(){
    Column( modifier = Modifier
        .fillMaxSize()
        .padding(start = 8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(end = 206.dp, top = 1.dp)
                .clip(RoundedCornerShape(28.dp))
                .size(180.dp)

        ) {
            Image(
                painter = painterResource(id = R.drawable.pisti),
                contentDescription = "My Image",
                modifier = Modifier

            )
            Button(
                onClick = { /* Add button click handler */ },
                modifier = Modifier

                    .padding(start = 185.dp)
                    .padding(top = 47.dp)
                    .width(200.dp)
                    .clip(RoundedCornerShape(28.dp))

                //.background(color = Color.Green)
            ) {Text(text = "Consulter")
            }
        }

    }
}


@Composable
fun btnINFO3IAC(){
    Row(modifier= Modifier) {
        Button(
            onClick = { /* Add button click handler */ },
            modifier = Modifier

                .padding(start = 185.dp)
                .padding(top = 47.dp)
                .width(200.dp)
                .clip(RoundedCornerShape(28.dp))

            //.background(color = Color.Green)
        ) {Text(text = "Consulter")
        }
    }
}

*/