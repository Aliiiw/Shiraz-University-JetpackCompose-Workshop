package com.alirahimi.jetpackworkshop.a8

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.alirahimi.jetpackworkshop.R

@Composable
fun MyTextField() {

    var textState by remember {
        mutableStateOf(TextFieldValue())
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(painter = painterResource(id = R.drawable.f10_golden_delicious), contentDescription = "" )
        
        Spacer(modifier = Modifier.height(50.dp))

        TextField(
            value = textState,
            onValueChange = {
                textState = it
            }
        )
    }

}