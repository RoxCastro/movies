package com.example.movies.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movies.ui.theme.MoviesTheme
import com.example.movies.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesTheme {
                Scaffold() {
                    NavigationComponent()

                }

            }

        }
    }
}

@Composable
fun NavigationComponent(){
    val navController = rememberNavController()
    NavHost(navController = navController,startDestination ="Home"){
        composable("Home"){
            HomeScreen(navController = navController)
        }
        composable("HomeScreen"){
            HomeScreenScreen()
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Button(onClick = { navController.navigate("HomeScreen") }) {
            Text("GO!") }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            painter = painterResource(id = R.drawable.video),
            contentDescription = "logo",
        )

        Text(
            text = "Buenos días",
            textAlign = TextAlign.Justify,
            color = Color(0xFF03DAC5),
            fontSize = 20.sp,
            letterSpacing = TextUnit.Unspecified,
            fontWeight = FontWeight.ExtraBold,
            overflow = TextOverflow.Clip,
            modifier = Modifier.padding(16.dp)
        )


        Text(
            text = "Bienvenido",
            textAlign = TextAlign.Justify,
            color = Color(0xFFBB86FC),
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            overflow = TextOverflow.Clip,
            letterSpacing = TextUnit.Unspecified,
            modifier = Modifier.fillMaxWidth()

        )
    }
}


@Composable
fun HomeScreenScreen(){
    RickAndMortyApp()
//    Text("pantalla de detalle")
}


