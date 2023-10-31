package com.b_labs.fiber_components.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.b_labs.fiber_tokens.FiberTheme

@Preview
@Composable
fun SecondaryButtonPreview() {
    SecondaryButton(text = "Preview")
}

@Composable
fun SecondaryButton(
    text: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    isEnabled: Boolean = true,
) {
    Button(
        enabled = isEnabled,
        contentPadding = contentPadding,
        colors = ButtonDefaults.buttonColors(
            containerColor = FiberTheme.colors.content.primary,
            contentColor = FiberTheme.colors.content.secondary,
            disabledContainerColor = FiberTheme.colors.content.primary,
            disabledContentColor = FiberTheme.colors.content.primary
        ),
        onClick = {  },
        content = {
            Text(
                text = text,
                fontSize = FiberTheme.typography.heading.typographyHeadingSmall.fontSize.sp
            )
        },
        modifier = modifier
    )
}
