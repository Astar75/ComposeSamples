package ru.astar.composesamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import ru.astar.composesamples.ui.theme.ComposeSamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeSamplesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HelloWorld()
                }
            }
        }
    }
}

@Composable
fun HelloWorld() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            modifier = Modifier
                .background(color = Color.Yellow)
                .align(BiasAlignment.Horizontal(.3f))
                .weight(2f),
            text = "Привет мир",
            fontSize = 18.sp
        )
        Text(
            text = "Еще какой то текст", modifier = Modifier
                .align(Alignment.Start)
                .background(Color.Green)
                .weight(2f)
        )
        Text(
            text = "42", modifier = Modifier
                .align(Alignment.End)
                .background(Color.Blue)
                .weight(2f)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun HelloWorldPreview() {
    ComposeSamplesTheme {
        HelloWorld()
    }
}