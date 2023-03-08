package com.alirahimi.jetpackworkshop.a12

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.alirahimi.jetpackworkshop.a8.MyTextField

@Composable
fun MySurface() {
    Surface(
        shape = CircleShape,
        elevation = 15.dp,
        modifier = Modifier.padding(16.dp),
        color = Color.Blue,
        contentColor = Color.Green,
        border = BorderStroke(width = 2.dp, color = Color.Magenta),

    ) {
        MyTextField()
    }
}