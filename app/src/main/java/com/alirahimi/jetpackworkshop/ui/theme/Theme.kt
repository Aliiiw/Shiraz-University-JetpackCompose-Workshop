package com.alirahimi.jetpackworkshop.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

private val CustomDarkColors = CustomColors(
    backgroundColor = dark22,
    buttonBackgroundColor = yell,
    buttonTextColor = dark22,
    textColor = lightCC,
)

private val CustomLightColors = CustomColors(
    backgroundColor = lightCC,
    buttonBackgroundColor = Purple500,
    buttonTextColor = lightCC,
    textColor = dark22,
)

//local provider -> biaim az system theming estefade konim bara dasrasi behesh niaze
private val localColorsProvider = staticCompositionLocalOf {
    CustomLightColors
}

@Composable
private fun CustomLocalProvider(
    colors: CustomColors,
    content: @Composable () -> Unit
) {
    val colorPalette = remember {
        colors.initColors()
    }

    colorPalette.update(colors = colors)

    CompositionLocalProvider(localColorsProvider provides colorPalette, content = content)
}


private val CustomTheme.colors: Pair<Colors, CustomColors>
    get() = when (this) {
        CustomTheme.DARK -> darkColors() to CustomDarkColors
        CustomTheme.LIGHT -> lightColors() to CustomLightColors
    }


object CustomThemeManager {
    val colors: CustomColors
        @Composable
        get() = localColorsProvider.current

    var customTheme by mutableStateOf(CustomTheme.LIGHT)

    fun isSystemInDarkTheme(): Boolean = customTheme == CustomTheme.DARK

}


@Composable
fun JetpackWorkshopTheme(
    customTheme: CustomTheme = CustomThemeManager.customTheme,
    content: @Composable () -> Unit
) {
    val (colorPalette, myColor) = customTheme.colors


    CustomLocalProvider(colors = myColor) {
        MaterialTheme(
            colors = colorPalette,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}

//bad mirim mySystemTheming
