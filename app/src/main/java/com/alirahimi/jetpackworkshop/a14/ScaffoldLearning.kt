package com.alirahimi.jetpackworkshop.a14

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import com.alirahimi.jetpackworkshop.a10.MyAppBar
import com.alirahimi.jetpackworkshop.ui.theme.Purple500

@Composable
fun MyScaffold() {

    Surface {
        MyScaffoldView()
    }
}

@Composable
fun MyScaffoldView() {

    Scaffold(
        topBar = { MyAppBar() },

        bottomBar = { MyBottomAppBarView() },

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

@Composable
fun MyBottomAppBarView() {

    BottomAppBar(backgroundColor = Purple500) {
        Text(text = "My Bottom App Bar")
    }

}

