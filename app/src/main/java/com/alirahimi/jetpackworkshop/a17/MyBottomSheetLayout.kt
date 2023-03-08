package com.alirahimi.jetpackworkshop.a17

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.alirahimi.jetpackworkshop.a10.MyAppBar
import com.alirahimi.jetpackworkshop.ui.theme.Purple500
import kotlinx.coroutines.launch
import kotlinx.coroutines.plus

@Composable
fun MyBottomSheetLayout() {
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

@SuppressLint("CoroutineCreationDuringComposition")
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ScaffoldHelper() {

    val scaffoldState = rememberScaffoldState()

    val scopeState = rememberCoroutineScope()

    val modalState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)

    Scaffold(
        scaffoldState = scaffoldState,

        topBar = { MyAppBar() },

        bottomBar = { MyBottomAppBar() },

        drawerContent = { Text(text = "Hello Drawer") },

        floatingActionButton = {
            FloatingActionButton(onClick = {
                scopeState.launch {
                    modalState.show()
                }
            }) {
                Text(text = "Rise")
            }
        },
        //floatingActionButtonPosition = FabPosition.Center,
        content = {

            Surface(modifier = Modifier.fillMaxSize()) {
                ModalBottomSheetLayout(
                    sheetState = modalState,
                    sheetContent = {
                        LazyColumn() {
                            items(count = 50) {
                                Row {
                                    Icon(Icons.Default.Star, contentDescription = "")
                                    Text(text = "Text $it")
                                }
                            }
                        }
                    },

                    ) {

                }
            }

        }
    )
}