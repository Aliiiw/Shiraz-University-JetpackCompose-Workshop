package com.alirahimi.jetpackworkshop.a15

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.alirahimi.jetpackworkshop.a10.MyAppBar
import com.alirahimi.jetpackworkshop.a14.MyBottomAppBarView
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus

@Composable
fun MySnackBar() {


    val scaffoldState = rememberScaffoldState()

    val scopeState = rememberCoroutineScope()


    Scaffold(
        scaffoldState = scaffoldState,

        topBar = { MyAppBar() },

        bottomBar = { MyBottomAppBarView() },

        drawerContent = { Text(text = "Hello Drawer") },

        floatingActionButton = {
            FloatingActionButton(onClick = {
                scopeState.launch {
                    scaffoldState.snackbarHostState.showSnackbar("Hello World")
                }
            }) {
                Text(text = "Show Snack Bar")
            }
        },

        //floatingActionButtonPosition = FabPosition.Center,

        content = {
            Surface() {
                Text(text = "Menu")
            }
        }
    )

}