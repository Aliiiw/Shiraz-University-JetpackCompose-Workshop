package com.alirahimi.jetpackworkshop.a13

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alirahimi.jetpackworkshop.R
import com.alirahimi.jetpackworkshop.a11.openDialogState


@Composable
fun MaterialDesignPart1() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        MyTextField2()
    }
}

@Composable
fun MyCheckBoxView() {
    val checkState = remember {
        mutableStateOf(true)
    }
    Checkbox(
        checked = checkState.value,
        onCheckedChange = {
            checkState.value = it
        }
    )
}

//level 1
@Composable
fun MyButton() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Login")
    }
}

//level 2
@Composable
fun MyButtonOutlined() {
    OutlinedButton(onClick = { /*TODO*/ }) {
        Text(text = "Sign Up")
    }
}

//level 3
@Composable
fun MyButtonText() {
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "Forgot Password")
    }
}

@Composable
fun MyTextField2() {

    var textState by remember {
        mutableStateOf(TextFieldValue())
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.f10_golden_delicious),
            contentDescription = ""
        )

        Spacer(modifier = Modifier.height(50.dp))

        TextField(
            value = textState,
            onValueChange = {
                textState = it
            }
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            MyButtonOutlined()

            Spacer(modifier = Modifier.width(10.dp))

            MyButton()
        }

        Spacer(modifier = Modifier.height(10.dp))

        MyButtonText()

        Spacer(modifier = Modifier.height(10.dp))

        MyCheckBoxView()

        Spacer(modifier = Modifier.height(10.dp))

        MyRadioButton()

        Spacer(modifier = Modifier.height(10.dp))
        MySwitch()

        CircularProgressIndicator()

        LinearProgressIndicator()
    }

}

@Composable
fun MyRadioButton() {

    val radioOptions = listOf("A", "B", "C", "D")

    val (selectedOption, onOptionSelected) = remember {
        mutableStateOf(radioOptions[0])
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        radioOptions.forEach { text ->
            Row(modifier = Modifier
                .padding(16.dp)
                .selectable(
                    selected = (text == selectedOption),
                    onClick = {
                        onOptionSelected(text)
                    }
                ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (text == selectedOption),
                    onClick = { onOptionSelected(text) }
                )
                Text(text = text, fontSize = 12.sp)
            }
        }
    }
}


@Composable
fun MySwitch() {

    val switchState = remember {
        mutableStateOf(false)
    }

    Switch(
        checked = switchState.value,
        onCheckedChange = {
            switchState.value = it
        }
    )
}