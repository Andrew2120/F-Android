package com.b_labs.fiber_tokens
import androidx.compose.ui.unit.*
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity

data class DesignSystem (
    var isDark: Boolean = false,
) {
    val color: DSColor get() = if (isDark) colorDark else colorLight
}