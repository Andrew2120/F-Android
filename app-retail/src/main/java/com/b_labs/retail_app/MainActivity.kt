package com.b_labs.retail_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.b_labs.fiber_components.F_Text
import com.b_labs.fiber_components.buttons.F_PrimaryButton
import com.b_labs.fiber_components.buttons.F_SecondaryButton
import com.b_labs.fiber_components.text_fields.F_PrimaryTextField
import com.b_labs.fiber_retail.designSystem
import com.b_labs.retail_app.ui.theme.FiberAndroid1Theme

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
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        F_Text(text = "Login")
                        F_PrimaryTextField(modifier = Modifier, text = "Email")
                        Spacer(modifier = Modifier.height(designSystem.space.gap.small.dp))
                        F_PrimaryTextField(modifier = Modifier, text = "Password")
                        Spacer(modifier = Modifier.height(designSystem.space.gap.medium.dp))
                        F_PrimaryButton(text = "Login", modifier = Modifier.fillMaxWidth()) {}
                        Spacer(modifier = Modifier.height(designSystem.space.gap.medium.dp))
                        F_SecondaryButton(text = "Register", modifier = Modifier.fillMaxWidth()) {}
                    }
                }
            }
        }
    }
}