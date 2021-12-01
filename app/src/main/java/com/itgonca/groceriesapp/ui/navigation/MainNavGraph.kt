package com.itgonca.groceriesapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.itgonca.groceriesapp.ui.navigation.screens.Screens
import com.itgonca.groceriesapp.ui.screens.IntroductoryScreen
import com.itgonca.groceriesapp.ui.screens.SplashScreen

@Composable
fun MainNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.SplashScreen.route) {
        composable(Screens.SplashScreen.route) {
            SplashScreen { navController.navigate(it) }
        }
        composable(Screens.IntroductoryScreen.route) {
            IntroductoryScreen()
        }
    }
}