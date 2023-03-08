package com.alirahimi.jetpackworkshop.a4

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun MyState() {
    MyButton()
}

@Composable
fun MyButton() {

    //1
    var buttonState = true

    //2
//    var buttonState by remember {
//        mutableStateOf(true)
//    }

    Button(
        onClick = { buttonState = !buttonState },
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = buttonState.toString())
    }
}