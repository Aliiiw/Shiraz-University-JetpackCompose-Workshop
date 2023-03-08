package com.alirahimi.jetpackworkshop.a19

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.alirahimi.jetpackworkshop.R

//state animate
//for ever animate


//1
@Composable
fun MyAnimations() {

    var isNeedToChange by remember {
        mutableStateOf(false)
    }

    val startColor = Color.Red
    val endColor = Color.Blue

    val backgroundColor by animateColorAsState(
        targetValue = if (isNeedToChange) endColor else startColor,
        animationSpec = tween(
            delayMillis = 100,
            durationMillis = 5000,
        )
    )

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .background(backgroundColor)
        )

        Button(onClick = {
            isNeedToChange = !isNeedToChange
        }) {
            Text(text = "Change the Color")
        }
    }
}


//2
@Composable
fun MyAnimationsRotate() {

    var isRotate by remember {
        mutableStateOf(false)
    }

    val rotateAngelState by animateFloatAsState(
        targetValue = if (isRotate) 360F else 0F,
        animationSpec = tween(
            durationMillis = 4000
        )
    )

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.d8_milkshake),
            contentDescription = "",
            modifier = Modifier
                .rotate(rotateAngelState)
                .size(150.dp)
        )

        Button(onClick = {
            isRotate = !isRotate
        }) {
            Text(text = "Rotate")
        }
    }
}

//3
@Composable
fun MyAnimationsInfinite() {
    val infiniteTransition = rememberInfiniteTransition()

    val size by infiniteTransition.animateFloat(
        initialValue = 100f,
        targetValue = 150f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 800,
                delayMillis = 100,
            ),
            repeatMode = RepeatMode.Reverse
        )
    )


    Image(
        painter = painterResource(id = R.drawable.d8_milkshake),
        contentDescription = "",
        modifier = Modifier
            .size(size.dp)
    )
}

