package com.alirahimi.jetpackworkshop.a16

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import com.alirahimi.jetpackworkshop.a10.MyAppBar
import com.alirahimi.jetpackworkshop.a14.MyBottomAppBarView
import com.alirahimi.jetpackworkshop.ui.theme.Purple500

@Composable
fun SeeWhatHappen() {
    ScaffoldHelper()
}


@Composable
fun MyBottomAppBar() {
    BottomAppBar(backgroundColor = Purple500) {
        BottomNavigationItem(
            selected = true,
            onClick = {},
            label = {
                Text(text = "Home")
            },
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = "")
            }

        )

        BottomNavigationItem(
            selected = false,
            onClick = {},
            label = {
                Text(text = "Setting")
            },
            icon = {
                Icon(imageVector = Icons.Default.Settings, contentDescription = "")
            }

        )

        BottomNavigationItem(
            selected = false,
            onClick = {},
            label = {
                Text(text = "Stars")
            },
            icon = {
                Icon(imageVector = Icons.Default.Star, contentDescription = "")
            }

        )

        BottomNavigationItem(
            selected = false,
            onClick = {},
            label = {
                Text(text = "Profile")
            },
            icon = {
                Icon(imageVector = Icons.Default.Person, contentDescription = "")
            }

        )
    }
}

@Composable
fun ScaffoldHelper() {
    Scaffold(
        topBar = { MyAppBar() },
        bottomBar = { MyBottomAppBar() },
        drawerContent = { Text(text = "Hello Drawer") },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Text(text = "+")
            }
        },
        //floatingActionButtonPosition = FabPosition.Center,
        content = { Text(text = "Hello Main") }
    )
}