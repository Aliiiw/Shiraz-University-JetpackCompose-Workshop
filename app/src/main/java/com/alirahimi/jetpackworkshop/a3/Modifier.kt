package com.alirahimi.jetpackworkshop.a3

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyModifier() {

    //tamami composable ha modifier migire


    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.LightGray)
            .padding(start = 8.dp, end = 5.dp)
            .clip(CircleShape)
            .border(width = 2.dp, color = Color.White)
            .clickable {
                Log.e("aliiiw", "Clicked by User")
            }

    ) {
        Text(text = "Hello", modifier = Modifier.background(Color.Green))
    }
}