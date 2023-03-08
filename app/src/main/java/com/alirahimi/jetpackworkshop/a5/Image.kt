package com.alirahimi.jetpackworkshop.a5

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alirahimi.jetpackworkshop.R


@Composable
fun MyImage() {

    //1
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        FoodItem(
            title = "Title",
            price = "35$",
            image = painterResource(id = R.drawable.d3_brownies),
            description = "Description1"
        )

        FoodItem(
            title = "Title2",
            price = "37$",
            image = painterResource(id = R.drawable.d4_wagashi),
            description = "Description2"
        )

        FoodItem(
            title = "Title",
            price = "35$",
            image = painterResource(id = R.drawable.d8_milkshake),
            description = "Description3"
        )

        FoodItem(
            title = "Title",
            price = "35$",
            image = painterResource(id = R.drawable.d3_brownies),
            description = "Description4"
        )
        FoodItem(
            title = "Title",
            price = "35$",
            image = painterResource(id = R.drawable.d3_brownies),
            description = "Description5"
        )

    }
}


//2
@Composable
fun FoodItem(title: String, price: String, image: Painter, description: String) {

    Column {
        Image(
            painter = image,
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, start = 8.dp, end = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = title, fontWeight = FontWeight.Bold)
            Text(text = price, color = Color.Magenta, fontSize = 14.sp)
        }

        Text(
            text = description,
            fontSize = 16.sp,
            modifier = Modifier.padding(bottom = 8.dp, start = 8.dp)
        )
    }
}