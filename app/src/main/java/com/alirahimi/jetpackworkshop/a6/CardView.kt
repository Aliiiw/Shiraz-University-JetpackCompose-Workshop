package com.alirahimi.jetpackworkshop.a6

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alirahimi.jetpackworkshop.R

@Composable
fun CardView(title: String, price: String) {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.DarkGray).padding(16.dp)) {
        Card(
            modifier = Modifier
                .fillMaxWidth(0.75f)
                .background(Color.Gray), elevation = 10.dp,
            shape = RoundedCornerShape(8.dp)

        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.d3_brownies),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                )

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = title, fontWeight = FontWeight.Bold, fontSize = 18.sp)

                    Text(text = price, fontSize = 16.sp, color = Color.Magenta)
                }
            }

        }
    }
}