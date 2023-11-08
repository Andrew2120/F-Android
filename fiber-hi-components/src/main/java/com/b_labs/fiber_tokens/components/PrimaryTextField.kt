package com.b_labs.fiber_tokens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.b_labs.fiber_tokens.localDesignSystem

@Preview(showBackground = true)
@Composable
fun PrimaryTextFieldPreview() {
    PrimaryTextField(
        value = "Text",
        label = "Label",
        supportingText = "Supporting text",
        onValueChange = {}
    )
}

@Composable
fun PrimaryTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    placeholderText: String? = null,
    label: String? = null,
    supportingText: String? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1
) {
    Column(
        modifier.background(localDesignSystem.current.color.content.primary),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        label?.let {
            Text(
                text = it,
                style =TextStyle(
                    fontSize = localDesignSystem.current.typography.utility.typographyUtilityMedium.fontSize.sp
                ) ,
                color = localDesignSystem.current.color.content.primary
            )
        }
        TextField(
            value = value,
            onValueChange = onValueChange,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon,
            placeholder = {
                placeholderText?.let {
                    Text(
                        text = placeholderText,
                        style = TextStyle(
                            fontSize = localDesignSystem.current.typography.utility.typographyUtilityMedium.fontSize.sp
                        ),
                    )
                }
            },
            minLines = minLines,
            maxLines = maxLines,
            keyboardActions = keyboardActions,
            keyboardOptions = keyboardOptions,
            visualTransformation = visualTransformation,
            shape = RectangleShape,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = localDesignSystem.current.color.semantic.neutral.semanticNeutral0,
                unfocusedContainerColor = localDesignSystem.current.color.semantic.danger.semanticDanger0,
                focusedIndicatorColor = Color.Unspecified,
                unfocusedIndicatorColor = Color.Unspecified
            ),
            modifier = Modifier.fillMaxWidth()
        )
        supportingText?.let {
            Text(
                text = it,
                style = TextStyle(
                    fontSize = localDesignSystem.current.typography.utility.typographyUtilityMedium.fontSize.sp

                ),
                color = if (isError) {
                    localDesignSystem.current.color.background.brandMuted
                } else {
                    localDesignSystem.current.color.content.primary
                }
            )
        }
    }
}
