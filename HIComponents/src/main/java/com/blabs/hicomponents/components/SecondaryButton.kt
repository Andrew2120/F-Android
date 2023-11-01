package com.blabs.hicomponents.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.blabs.hicomponents.theme.HITheme

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
            containerColor = HITheme.current.color.content.primary,
            contentColor = HITheme.current.color.content.secondary,
            disabledContainerColor = HITheme.current.color.content.primary,
            disabledContentColor = HITheme.current.color.content.primary
        ),
        onClick = {  },
        content = {
            Text(
                text = text,
                fontSize = HITheme.current.typography.heading.typographyHeadingSmall.fontSize.sp
            )
        },
        modifier = modifier
    )
}
