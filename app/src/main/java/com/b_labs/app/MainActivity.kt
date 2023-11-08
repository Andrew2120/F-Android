package com.b_labs.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.b_labs.app.ui.theme.FiberAndroid1Theme
import com.b_labs.fiber_tokens.components.PrimaryButton
import com.b_labs.fiber_tokens.components.PrimaryOutlinedButton
import com.b_labs.fiber_tokens.components.PrimaryTextField

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FiberAndroid1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "hello")
        PrimaryTextField(value = "", onValueChange = {})
        PrimaryTextField(value = "", onValueChange = {})
        PrimaryButton(modifier = Modifier.fillMaxWidth(0.7f), text = "Login")
        PrimaryOutlinedButton(modifier = Modifier.fillMaxWidth(0.5f), text = "Login")

        PrimaryButton(modifier = Modifier.fillMaxWidth(0.5f), text = "Register")
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FiberAndroid1Theme {
        Greeting("Android")
    }
}