package com.alirahimi.jetpackworkshop.a21

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.alirahimi.jetpackworkshop.a10.MyAppBar
import com.alirahimi.jetpackworkshop.a14.MyBottomAppBarView
import com.alirahimi.jetpackworkshop.ui.theme.CustomTheme
import com.alirahimi.jetpackworkshop.ui.theme.CustomThemeManager
import com.alirahimi.jetpackworkshop.ui.theme.JetpackWorkshopTheme
import kotlinx.coroutines.launch


@Composable
fun MySystemTheming() {

    Scaffold(

        topBar = { MyAppBar() },

        bottomBar = { MyBottomAppBarView() },

        drawerContent = { Text(text = "Hello Drawer") },

        floatingActionButton = {
            FloatingActionButton(onClick = {

            }) {
                Text(text = "Show Snack Bar")
            }
        },

        //floatingActionButtonPosition = FabPosition.Center,

        content = {

            JetpackWorkshopTheme() {
                Surface(modifier = Modifier.fillMaxSize()) {

                    Column {
                        Button(
                            onClick = {
                                CustomThemeManager.customTheme =
                                    if (CustomThemeManager.customTheme == CustomTheme.DARK) {
                                        CustomTheme.LIGHT
                                    } else {
                                        CustomTheme.DARK
                                    }
                            },
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = CustomThemeManager.colors.buttonBackgroundColor,
                                contentColor = CustomThemeManager.colors.buttonTextColor
                            )
                        ) {
                            Text(text = "Tap to Change Theme")
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            text = "Current theme is: ${
                                if (CustomThemeManager.isSystemInDarkTheme()) "Dark" else "Light"
                            }"
                        )
                    }
                }
            }
        }
    )
}