package com.alirahimi.jetpackworkshop.a22

sealed class Screen(val route: String) {
    object Home : Screen(route = "homeScreen")
    object Second : Screen(route = "secondScreen")
}
