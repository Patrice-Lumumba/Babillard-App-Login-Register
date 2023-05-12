package com.example.babillard.ecoles.filieres3IAC




import  android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myproject.R
import com.example.myproject.ui.theme.MyProjectTheme


//import com.example.myproject.ui.theme.BabillardTheme
//import androidx.compose.material3.*


/////////////////// Ne pas toucher ////////////////////////////
@Composable
fun MyBox1( navController : NavHostController ) {

    Box(
        modifier = Modifier

            .fillMaxWidth(),

        ){Box(modifier = Modifier

        .size(400.dp)
        .background(color = androidx.compose.ui.graphics.Color.Red),
        contentAlignment= Alignment.TopStart
    ){

        ///////////////////////////////////////////////////////////////////////////////


        Spacer(modifier = Modifier
            .height(150.dp)
            .padding(top = 150.dp)

        )
        Column(
            modifier = Modifier
                .padding(top = 15.dp, start = 45.dp)
                .size(516.dp)
        ) {
            Text(text = "Nos filières ",
                style = TextStyle(
                    color = Color.White
                )

            )
            Column(modifier = Modifier

                .padding(top = 25.dp, start = 80.dp)
                //.height(100.dp)
                //.width(100.dp)
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




            Box(



            ){
                Column() {

                }
            }
            // Spacer(modifier = Modifier.height(90.dp))

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

            LazyColumn(){
                item {

                    Column(modifier = Modifier
                        .padding(top = 15.dp)
                    ) {

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),

                            contentAlignment= Alignment.BottomCenter



                        ){

                            ///////
                            //Spacer(modifier = Modifier.padding(98.dp))
                            Column(

                                modifier = Modifier
                                    .height(108.dp)

                                    .padding(top = 9.dp)


                                    .size(328.dp)
                                    //.clip(RoundedCornerShape(30.dp))
                                    ////////////////////////////////////////

                                    .background(color = Color.Transparent)
                                    .shadow(2.dp, shape = RoundedCornerShape(28.dp))


                            )
                            {
                                Column( modifier = Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally,

                                    ) {


                                    country3IAC()

                                }



                            }

                            //////         ////////



                            Box(modifier = Modifier
                                .fillMaxSize(),
                                contentAlignment= Alignment.BottomCenter
                            ) {
                                btn3IAC(navController)
                            }





                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment= Alignment.BottomCenter



                        ){

                            ///////
                            //Spacer(modifier = Modifier.padding(100.dp))
                            Column(

                                modifier = Modifier
                                    .height(110.dp)

                                    .padding(top = 11.dp)


                                    .size(330.dp)
                                    .clip(RoundedCornerShape(28.dp))

                                    .background(color = Color.LightGray),



                                )
                            {

                                Bombieri3IAC()



                            }

                            //////         ////////

                            Box(modifier = Modifier
                                .fillMaxSize(),
                                contentAlignment= Alignment.BottomCenter
                            ) {
                                btn3IAC(navController)
                            }




                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment= Alignment.BottomCenter



                        ){

                            ///////
                            //Spacer(modifier = Modifier.padding(100.dp))
                            Column(

                                modifier = Modifier
                                    .height(110.dp)

                                    .padding(top = 11.dp)


                                    .size(330.dp)
                                    .clip(RoundedCornerShape(28.dp))

                                    .background(color = Color.LightGray),



                                )
                            {
                                Column( modifier = Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally,

                                    ) {
                                    pisti3IAC()

                                }



                            }

                            //////         ////////

                            Box(modifier = Modifier
                                .fillMaxSize(),
                                contentAlignment= Alignment.BottomCenter
                            ) {
                                btn3IAC(navController)
                            }




                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment= Alignment.BottomCenter



                        ){

                            ///////
                            //Spacer(modifier = Modifier.padding(100.dp))
                            Column(

                                modifier = Modifier
                                    .height(110.dp)

                                    .padding(top = 11.dp)


                                    .size(330.dp)
                                    .clip(RoundedCornerShape(28.dp))

                                    .background(color = Color.LightGray),



                                )
                            {
                                Column( modifier = Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally,

                                    ) {

                                    iac3IAC()



                                }

                            }

                            //////         ////////
                            Box(modifier = Modifier
                                .fillMaxSize(),
                                contentAlignment= Alignment.BottomCenter
                            ) {
                                btn3IAC(navController)
                            }





                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentAlignment= Alignment.BottomCenter



                        ){

                            ///////
                            //Spacer(modifier = Modifier.padding(100.dp))
                            Column(

                                modifier = Modifier
                                    .height(110.dp)

                                    .padding(top = 11.dp)


                                    .size(330.dp)
                                    .clip(RoundedCornerShape(28.dp))

                                    .background(color = Color.LightGray),



                                )
                            {
                                Column( modifier = Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally,

                                    ) {


                                    istdi3IAC()

                                }



                            }

                            //////         ////////
                            Box(modifier = Modifier
                                .fillMaxSize(),
                                contentAlignment= Alignment.BottomCenter
                            ) {
                                btn3IAC(navController)
                            }





                        }
                    }
                }

            }


            ////////////////////////






        }





    }


}
////////////////////////////////////////////////////////////


@Preview(showBackground = true)
@Composable
fun Preview() {
    val navController = rememberNavController()
    MyProjectTheme {
        MyBox1(navController)
        Bombieri3IAC()
        country3IAC()
        istdi3IAC()
        iac3IAC()
        pisti3IAC()
        btn3IAC(navController)
    }
}



@Composable
fun Bombieri3IAC(){


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
                .clip(
                    RoundedCornerShape(30.dp)
                )
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
fun country3IAC(){
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
                painter = painterResource(id = R.drawable.icia),
                contentDescription = "My Image",
                modifier = Modifier

            )

        }

    }
}

@Composable
fun istdi3IAC(){
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
fun iac3IAC(){
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
fun pisti3IAC(){
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


            ////////////////////////////////


        }

    }
}

@Composable
fun btn3IAC( navController: NavHostController ) {
    Row(modifier = Modifier) {
        Button(
            onClick = { navController.navigate("Login") },
            modifier = Modifier

                .padding(start = 185.dp)

                .padding(top = 47.dp)
                .width(130.dp)
                .clip(RoundedCornerShape(28.dp))


            //.background(color = Color.Green)
        ) { Text(text = "Consulter ") }
    }
}



