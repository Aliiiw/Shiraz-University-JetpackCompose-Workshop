package com.alirahimi.jetpackworkshop.a22

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavigationGraph(
    navHostController: NavHostController,
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route,
    ) {

        composable(route = Screen.Home.route) {
            HomeScreen(navHostController = navHostController)
        }

        composable(route = Screen.Second.route) {
            SecondScreen(navHostController = navHostController)
        }
    }
}