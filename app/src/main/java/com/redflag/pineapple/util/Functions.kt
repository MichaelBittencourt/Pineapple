package com.redflag.pineapple.util

import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp

enum class WindowSize { COMPACT, MEDIUM, EXPANDED }

fun getWindowSizeClass(windowDpSize: DpSize): WindowSize = when {
    windowDpSize.width < 0.dp -> throw IllegalArgumentException("Dp value cannot be negative")
    windowDpSize.width < 600.dp -> WindowSize.COMPACT
    windowDpSize.width < 840.dp -> WindowSize.MEDIUM
    else -> WindowSize.EXPANDED
}
