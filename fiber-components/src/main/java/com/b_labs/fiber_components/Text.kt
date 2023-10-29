package com.b_labs.fiber_components

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.b_labs.fiber_tokens.FiberTheme.designSystem

@Composable
fun F_Text(text:String) {
    androidx.compose.material3.Text(text = text, style = TextStyle(
        fontSize = designSystem.typography.code.typographyCodeMedium.fontSize.sp
    ))
}