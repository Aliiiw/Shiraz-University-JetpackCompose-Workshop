package com.alirahimi.jetpackworkshop.a9

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alirahimi.jetpackworkshop.R

@Composable
fun MyCallingView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xFF6155FF),
                        Color.Transparent
                    )
                )
            )
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.sim),
                contentDescription = "",
                modifier = Modifier.size(28.dp)
            )

            Text(
                text = "Calling...",
                fontSize = 20.sp,
                color = Color.White
            )


        }


        Spacer(modifier = Modifier.height(36.dp))

        Text(
            text = "Ali Rahimi",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Mobile +989171234567", fontSize = 20.sp, color = Color.White)

        Spacer(modifier = Modifier.height(160.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(16.dp), elevation = 10.dp, shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    MyItemToShow(image = painterResource(id = R.drawable.plus), title = "Add call")
                    MyItemToShow(
                        image = painterResource(id = R.drawable.pause),
                        title = "Hold call"
                    )
                    MyItemToShow(
                        image = painterResource(id = R.drawable.bluetooth),
                        title = "Bluetooth"
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    MyItemToShow(
                        image = painterResource(id = R.drawable.speaker),
                        title = "Speaker"
                    )
                    MyItemToShow(image = painterResource(id = R.drawable.mic), title = "Mute")
                    MyItemToShow(image = painterResource(id = R.drawable.dial), title = "Keypad")
                }

                Image(
                    painter = painterResource(id = R.drawable.phone),
                    contentDescription = "",
                    modifier = Modifier.size(55.dp)
                )

            }
        }
    }
}

@Composable
fun MyItemToShow(image: Painter, title: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = image, contentDescription = "", modifier = Modifier.size(35.dp))

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = title, style = MaterialTheme.typography.subtitle1)
    }
}