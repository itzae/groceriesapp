package com.itgonca.groceriesapp.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.itgonca.groceriesapp.ui.navigation.screens.Screens
import com.itgonca.groceriesapp.ui.screens.IntroductoryScreen
import com.itgonca.groceriesapp.ui.screens.LoginScreen
import com.itgonca.groceriesapp.ui.screens.SplashScreen

@Composable
fun MainNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.SplashGroceriesScreen.route) {
        composable(Screens.SplashGroceriesScreen.route) {
            SplashScreen { navController.navigate(it) }
        }
        composable(Screens.IntroductoryScreen.route) {
            IntroductoryScreen { navController.navigate(Screens.LoginScreen.route) }
        }
        composable(Screens.LoginScreen.route){
            LoginScreen()
        }
    }
}