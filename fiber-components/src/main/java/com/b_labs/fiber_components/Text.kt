package com.b_labs.fiber_components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.b_labs.bodyMedium
import com.b_labs.codeMed

@Composable
fun F_Text(text: String) {
    Text(
        text = text, style = bodyMedium()
    )
}
@Composable
fun F_Text2(text: String) {
    Text(
        text = text, style = codeMed()
    )
}