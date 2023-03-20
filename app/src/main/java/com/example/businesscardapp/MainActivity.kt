package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    //Greeting("Android")
                    FullScreen()
                }
            }
        }
    }
}


@Composable
fun FullScreen(){
    Surface(color = colorResource(id = R.color.bgcolor))
     {
            LogoWithText()


            ContactDetails()

    }
    
}
@Composable
fun LogoWithText() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(id = R.drawable.new_android_2_1200x750)
        Image(painter = image, contentDescription = "Android logo",

            modifier = Modifier
                .height(100.dp)
                .width(100.dp), contentScale = ContentScale.FillHeight)
        Text("Aditya Shigwan", fontSize = 40.sp, color = Color.White, fontFamily = FontFamily.SansSerif, modifier = Modifier.padding(16.dp))
        Text("Android Developer Extraordinaire", color = Color.Green, fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(bottom = 10.dp))
    }
}

@Composable
fun ContactDetails(){
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.padding(bottom = 50.dp)
    ){
        Divider(color = Color.LightGray)
        Row(modifier = Modifier.padding(start = 50.dp, top=10.dp, bottom=10.dp), horizontalArrangement = Arrangement.Center){
            val phoneIcon = painterResource(id = R.drawable.baseline_local_phone_24)
            Icon(painter = phoneIcon, contentDescription = "phoneIcon", tint = Color.Green)
            Text("+11 (123) 444 555 666", color = Color.White, modifier = Modifier.padding(start = 20.dp))
        }
        Divider(color = Color.LightGray)
        Row(
            modifier = Modifier.padding(start = 50.dp, top=10.dp, bottom=10.dp), horizontalArrangement = Arrangement.Center
        ){
            val shareIcon = painterResource(id = R.drawable.baseline_share_24)
            Icon(painter = shareIcon, contentDescription = "shareIcon", tint = Color.Green)
            Text("@AndroidDev", color = Color.White, modifier = Modifier.padding(start = 20.dp))
        }
        Divider(color = Color.LightGray)
        Row(Modifier.padding(start = 50.dp, top=10.dp, bottom=10.dp), horizontalArrangement = Arrangement.Center){
            val emailIcon = painterResource(id = R.drawable.baseline_email_24)
            Icon(painter = emailIcon, contentDescription = "emailIcon", tint = Color.Green)
            Text("aditya.shigwan@android.com", color = Color.White,modifier = Modifier.padding(start = 20.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun FullScreenPreview() {
    BusinessCardAppTheme {
        //LogoWithText()
        FullScreen()
    }
}