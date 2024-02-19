package com.example.apptarjetas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.apptarjetas.ui.theme.AppTarjetasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTarjetasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tarjeta("Jennifer Doe","Android Developer Extraordinaire", "444 555 666", "@AndroidDev","jen.doe@android.com")
                }
            }
        }
    }
}

@Composable
fun Tarjeta(name: String, title: String, number: String, social: String, email: String, modifier: Modifier = Modifier)
{
    val image = painterResource(R.drawable.android_logo)
    Column (
        modifier = Modifier
            .background(Color(0xFF3ddc84))
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    )
    {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        )
        {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .background(Color.DarkGray)
            )
            Text(text = "$name")
            Text(text = "$title")
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        )
        {
            Text(text = "$number")
            Text(text = "$social")
            Text(text = "$email")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview()
{
    AppTarjetasTheme {
        Tarjeta("Jennifer Doe","Android Developer Extraordinaire", "444 555 666", "@AndroidDev","jen.doe@android.com")
    }
}