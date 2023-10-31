package com.b_labs.fiber_components.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.b_labs.fiber_tokens.FiberTheme

@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(FiberTheme.spacing.padding.padding2xSmall.dp),
    isEnabled: Boolean = true,
    shape: Shape = RoundedCornerShape(FiberTheme.borderRadius.medium.dp),
    colors: ButtonColors =
        ButtonDefaults.buttonColors(
            containerColor = FiberTheme.colors.action.primary.actionPrimaryNormal,
            contentColor = FiberTheme.colors.content.primary
        ),
) {
    Button(
        shape = shape,
        enabled = isEnabled,
        contentPadding = contentPadding,
        colors = colors,
        onClick = {},
        content = {
            Text(
                text = text,
                fontSize = FiberTheme.typography.body.typographyBodyMedium.fontSize.sp,
                fontWeight = FontWeight(FiberTheme.typography.body.typographyBodyMedium.fontWeight.toInt())
            )

        },
        modifier = modifier
    )
}


