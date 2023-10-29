package com.b_labs.deel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.b_labs.deel.ui.theme.FiberAndroid1Theme
import com.b_labs.fiber_components.buttons.PrimaryButton
import com.b_labs.fiber_components.buttons.SecondaryButton
import com.b_labs.fiber_components.text_fields.PrimaryTextField
import com.b_labs.fiber_deel.designSystem

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
                    Column(
                        Modifier.padding(designSystem.space!!.gap.small!!.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        PrimaryTextField(modifier = Modifier, text = "Email")
                        Spacer(modifier = Modifier.height(designSystem.space?.gap?.small!!.dp))
                        PrimaryTextField(modifier = Modifier, text = "Password")
                        Spacer(modifier = Modifier.height(designSystem.space?.gap?.medium!!.dp))
                        PrimaryButton(text = "Login", modifier = Modifier.fillMaxWidth())
                        Spacer(modifier = Modifier.height(designSystem.space?.gap?.medium!!.dp))
                        SecondaryButton(text = "Register", modifier = Modifier.fillMaxWidth())
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FiberAndroid1Theme {
        Greeting("Android")
    }
}