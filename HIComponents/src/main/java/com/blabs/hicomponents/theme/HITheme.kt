package com.blabs.hicomponents.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

object HITheme {
    var current: DesignSystem =baseDesignSystem
        private set


    private var LocalTheme = staticCompositionLocalOf {
        baseDesignSystem
    }


    fun setCurrentTheme(newTheme: DesignSystem) {
        current = newTheme
    }

}

