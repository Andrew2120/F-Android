package com.b_labs.fiber_components.buttons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.b_labs.fiber_tokens.FiberTheme.designSystem

@Composable
fun F_PrimaryButton(
    modifier: Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(contentColor = designSystem.color.content.primary)
    ) {
        Text(text = text)
    }
}

@Composable
fun F_SecondaryButton(
    modifier: Modifier,
    text: String,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(contentColor = designSystem.color.content.secondary)

    ) {
        Text(text = text)
    }
}