package com.example.showtime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.showtime.ui.theme.ShowtimeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShowtimeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "start",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "flashcard question screen" +
                "nelson mandela was president in 1994" +
                "world war 2 ended in 1942" +
                "the berlin wall fell in 1989" +
                "the first man on the moon was in 1969" +
                "the roman empire fell in 476 AD!" +
                "second array is the five answers of the 5 questions" +
                "number 1 = true" +
                "number 2 = false" +
                "number 3 = true" +
                "number 4 = true" +
                "number 5 = true"
                +
        ,
        modifier =modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShowtimeTheme {
        Greeting("Android")
    }
}