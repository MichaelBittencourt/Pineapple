package com.redflag.pineapple.util

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

fun Modifier.centerContent() = this
    .fillMaxWidth()
    .wrapContentWidth(align = Alignment.CenterHorizontally)

//@Composable
//fun Modifier.textFieldStyle() = this
//    .shape(RoundedCornerShape(5.dp))
//    .colors(TextFieldDefaults.textFieldColors(focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent, disabledIndicatorColor = Color.Transparent))