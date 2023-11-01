package com.blabs.hicomponents.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

object HITheme {
    var current: DesignSystem = baseDesignSystem
        private set


    fun setCurrentTheme(newTheme: DesignSystem) {
        current = newTheme
    }

    val designSystem
        @Composable
        get() = localDesignSystem.current

}

val localDesignSystem = staticCompositionLocalOf {
    baseDesignSystem
}