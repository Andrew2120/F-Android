package com.b_labs.fiber_tokens

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

object FiberTheme {
    val colors
        @Composable
        get() = localColors.current

    val test
        @Composable
        get() = localTest.current


    val typography
        @Composable
        get() = localTypography.current
    val spacing
        @Composable
        get() = localSpacing.current

    val sizing
        @Composable
        get() = localSizing.current
    val borderRadius
        @Composable
        get() = localBorderRadius.current
}

sealed class FontUnit {

    class DP(val value: Double) : FontUnit()
    class PX(val value: Double) : FontUnit()

}

@Composable
fun FontUnit.dp(): Dp {
    return when (this) {
        is FontUnit.DP -> this.value.dp
        is FontUnit.PX -> {
            with(LocalDensity.current) { 16.dp.toPx().toDp() }
        }
    }
}
