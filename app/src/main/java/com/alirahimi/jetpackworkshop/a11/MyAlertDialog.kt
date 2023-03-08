package com.alirahimi.jetpackworkshop.a11

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

val openDialogState = mutableStateOf(true)

@Composable
fun MyAlertDialog() {
    MaterialTheme {

        Column(Modifier.fillMaxSize()) {
            val openDialog = remember {
                openDialogState
            }

            if (openDialog.value) {
                AlertDialog(
                    onDismissRequest = {},
                    title = {
                        Text(text = "Title of Alert")
                    },
                    text = {
                        Text(text = "Dialog")
                    },
                    confirmButton = {
                        Button(onClick = {}) {
                            Text(text = "Cancel")
                        }
                    },
                    dismissButton = {
                        Button(
                            onClick = { openDialog.value = false },
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = Color.Red,
                                contentColor = Color.White
                            )
                        ) {
                            Text(text = "Leave")
                        }
                    }

                )
            }
        }
    }
}
