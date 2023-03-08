package com.alirahimi.jetpackworkshop.a7

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//Tap to Increase app
@Composable
fun MyApp1() {
    var moneyCounter by remember {
        mutableStateOf(0)
    }

    //1
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF84D8FF)
    ) {
        //2
        Column(
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //3
            Text(
                text = "Tap the button to increase the price",
                fontSize = 32.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )

            //4
            Text(text = moneyCounter.toString(), fontSize = 24.sp)

            //Spacer(modifier = Modifier.height(32.dp))

            //5
            CreateCircle(moneyCounter = moneyCounter) {
                moneyCounter += 100
            }
        }
    }
}


//6
@Composable
fun CreateCircle(moneyCounter: Int = 0, updateCounter: (Int) -> Unit) {


    Card(
        modifier = Modifier
            .padding(3.dp)
            .size(100.dp)
            .clickable {
                updateCounter(moneyCounter)
            },
        shape = CircleShape,
        elevation = 8.dp
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(text = "Tap")
        }

    }
}