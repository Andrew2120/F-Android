package com.b_labs.fiber_components.text_fields

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.b_labs.fiber_tokens.FiberTheme.designSystem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun F_PrimaryTextField(
    modifier: Modifier,
    text: String
) {

    OutlinedTextField(
        value = "",
        modifier = modifier,
        onValueChange = {},
        label = { Text(text) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = designSystem.color.content.primary,
            unfocusedBorderColor = designSystem.color.content.infoPrimary
        )
    )

}
