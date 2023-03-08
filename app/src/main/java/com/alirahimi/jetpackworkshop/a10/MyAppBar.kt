package com.alirahimi.jetpackworkshop.a10

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.alirahimi.jetpackworkshop.a11.openDialogState

@Composable
fun MyAppBar() {

    Column {
        TopAppBar(
            elevation = 10.dp,
            title = { Text(text = "JetPack Workshop") },     //navigation samt chap   action samt rast
            actions = {
                IconButton(onClick = {}) {
                    Icon(Icons.Filled.Email, contentDescription = "")
                }

                IconButton(onClick = {}) {
                    Icon(Icons.Filled.Share, contentDescription = "")
                }

                IconButton(onClick = {}) {
                    Icon(Icons.Filled.Star, contentDescription = "")
                }
            },
            navigationIcon = {
                IconButton(onClick = {
                    openDialogState.value = true
                }) {
                    Icon(Icons.Filled.Menu, contentDescription = "")
                }
            }
        )
    }
}