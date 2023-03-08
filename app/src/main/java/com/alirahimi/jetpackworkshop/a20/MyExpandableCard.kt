package com.alirahimi.jetpackworkshop.a20

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MyExpandableCard() {

    var expandState by remember {
        mutableStateOf(false)
    }

    val rotateArrowState by animateFloatAsState(
        targetValue = if (expandState) 180F else 0F
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300
                )
            ),
        shape = RoundedCornerShape(9.dp),
        onClick = {
            expandState = !expandState
        }
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "My Title", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                IconButton(
                    modifier = Modifier
                        .alpha(ContentAlpha.medium)
                        .rotate(rotateArrowState),
                    onClick = {
                        expandState = !expandState
                    }) {
                    Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "")
                }
            }

            if (expandState) {
                Text(
                    text = "syrjsfjmfhjfyjsryjar;lthal;thaelothaldothaldthladhsyrjsfjmfhjfyjsryjar" +
                            ";lthal;thaelothaldothaldthladhsyrjsfjmfhjfyjsryjar;lthal;thaelothaldothaldthladhsyrjsf" +
                            "jmfhjfyjsryjar;lthal;thaelothaldothaldthladhsyrjsfjmfhjfyjsryjar;lthal;thaelothaldothald" +
                            "thladhsyrjsfjmfhjfyjsryjar;lthal;thaelothaldothaldthladhsyrjsfjmfhjfyjsryjar;lthal;thaelot" +
                            "haldothaldthladhsyrjsfjmfhjfyjsryjar;lthal;thaelothaldothaldthladhsyrjsfjmfhjfyjsryjar;lthal;" +
                            "thaelothaldothaldthladhsyrjsfjmfhjfyjsryjar;lthal;thaelothaldothaldthladh"
                )
            }
        }


    }

}