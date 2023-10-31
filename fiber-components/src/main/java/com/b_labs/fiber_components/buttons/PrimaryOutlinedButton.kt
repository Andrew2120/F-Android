package com.b_labs.fiber_components.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.b_labs.fiber_tokens.FiberTheme

@Preview
@Composable
fun PrimaryOutlinedButtonPreview() {
    PrimaryOutlinedButton(
        text = "Preview",

    )
}

@Composable
fun PrimaryOutlinedButton(
    text: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(FiberTheme.spacing.padding.padding2xLarge.dp),
    isEnabled: Boolean = true,
    shape: Shape = RectangleShape,
    contentColor: Color = FiberTheme.colors.action.primary.actionPrimaryActive,
) {
    OutlinedButton(
        onClick = {},
        modifier = modifier,
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = contentColor,
            disabledContentColor = FiberTheme.colors.action.danger.actionDangerNormal
        ),
        border = BorderStroke(
            2.dp,
            if (isEnabled) {
                contentColor
            } else {
                FiberTheme.colors.content.brandPrimary
            }
        ),
        shape = shape,
        enabled = isEnabled,
        contentPadding = contentPadding
    ) {
        Text(
            text = text
        )

    }
}
