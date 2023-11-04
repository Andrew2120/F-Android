package com.blabs.hicomponents.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

object HITheme {
    val designSystem
        @Composable
        get() = localDesignSystem.current

}

val localDesignSystem = staticCompositionLocalOf {
    baseDesignSystem
}