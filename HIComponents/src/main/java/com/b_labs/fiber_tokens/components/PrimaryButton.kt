package com.b_labs.fiber_tokens.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.b_labs.fiber_tokens.localDesignSystem

@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(localDesignSystem.current.space.padding.padding2xSmall.dp),
    isEnabled: Boolean = true,
    shape: Shape = RoundedCornerShape(localDesignSystem.current.borderRadius.medium.dp),
    colors: ButtonColors =
        ButtonDefaults.buttonColors(
            containerColor = localDesignSystem.current.color.action.primary.actionPrimaryNormal,
            contentColor = localDesignSystem.current.color.content.primary
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
                fontSize = localDesignSystem.current.typography.body.typographyBodyMedium.fontSize.sp,
                fontWeight = FontWeight(localDesignSystem.current.typography.body.typographyBodyMedium.fontWeight.toInt())
            )

        },
        modifier = modifier
    )
}


