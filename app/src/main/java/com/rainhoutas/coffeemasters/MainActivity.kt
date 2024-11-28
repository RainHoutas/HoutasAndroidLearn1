package com.rainhoutas.coffeemasters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rainhoutas.coffeemasters.ui.theme.大咖erTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            大咖erTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingPreview()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Dick(){
    Row() {
        Text("大哥大嫂过年好",
            modifier = Modifier
                .padding(16.dp)
                .background(Color.Yellow)
                .padding(16.dp)
        )
        Text("大哥大嫂过年好，你是我的爷我是你的儿3333",
            modifier = Modifier
                .padding(13.dp)
                .background(Color.Yellow)
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    var name = remember { mutableStateOf("") }
    Column() {
        Text(
            text = "Hello ${name.value}!",
            fontSize = 16.sp,
            modifier = Modifier
                .padding(13.dp)
                .background(Color.Yellow)
                .padding(16.dp)
            )
        TextField( value = name.value, onValueChange = { name.value = it })
    }
}