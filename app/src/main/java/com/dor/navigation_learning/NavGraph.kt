package com.dor.navigation_learning

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Details: Screen(route = "details_screen")
}

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(navHostController = navHostController)
        }
        composable(route = Screen.Details.route) {
            DetailsScreen(navHostController = navHostController)
        }
    }
}