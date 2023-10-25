package com.b_labs.fiber_components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.b_labs.fiber_tokens.FiberTheme

@Composable
fun PrimaryButton() {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            containerColor = com.b_labs.fiber_tokens.FiberTheme.system.color.coolGray.negative4,
            contentColor = com.b_labs.fiber_tokens.FiberTheme.system.color.coolGray.coolGray0,
        ),

        ) {
        Text(text = "Click")
    }
}