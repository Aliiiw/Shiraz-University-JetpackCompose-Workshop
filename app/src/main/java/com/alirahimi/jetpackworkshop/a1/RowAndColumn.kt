package com.alirahimi.jetpackworkshop.a1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ColumnAndRow() {

    //1
    Column() {
        Text(text = "text1")
        Text(text = "text2")
        Text(text = "text3")

    }

    //2
    Row(
        modifier = Modifier
            .fillMaxSize(0.5f)
            .fillMaxWidth()
            .height(20.dp)
            .size(20.dp)
            .background(Color.LightGray)
    ) {
        Text(text = "text1")
        Text(text = "text1")
        Text(text = "text1")

    }

    //3
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "text1")
        Text(text = "text1")
        Text(text = "text1")
    }
}