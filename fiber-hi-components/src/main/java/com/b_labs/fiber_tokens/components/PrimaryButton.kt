package com.b_labs.fiber_tokens.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.b_labs.fiber_tokens.localDesignSystem

@Composable
fun PrimaryButton(
    modifier: Modifier,
    text: String = "Click",
    contentPadding: PaddingValues = PaddingValues(localDesignSystem.current.space.padding.padding2xSmall.dp),
    isEnabled: Boolean = true,
    shape: Shape = RoundedCornerShape(localDesignSystem.current.borderRadius.full.dp),
    colors: ButtonColors =
        ButtonDefaults.buttonColors(
            containerColor = localDesignSystem.current.color.action.primary.actionPrimaryNormal,
            contentColor = localDesignSystem.current.color.semantic.neutral.semanticNeutral7
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
                style = TextStyle(
                    fontSize = localDesignSystem.current.typography.body.typographyBodyMedium.fontSize.sp,
                    fontWeight = FontWeight(localDesignSystem.current.typography.body.typographyBodyMedium.fontWeight.toInt())

                )
            )

        },
        modifier = modifier
    )
}


