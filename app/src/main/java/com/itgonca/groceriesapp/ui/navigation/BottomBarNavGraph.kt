package com.itgonca.groceriesapp.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.itgonca.groceriesapp.ui.navigation.screens.BottomBarScreens
import com.itgonca.groceriesapp.ui.screens.HomeScreen

@Composable
fun BottomBarNavGraph(
    navController: NavHostController,
    innerPaddingValues: PaddingValues
) {
    NavHost(navController = navController, startDestination = BottomBarScreens.Home.route) {
        composable(route = BottomBarScreens.Home.route) {
            HomeScreen(modifier = Modifier.padding(innerPaddingValues))
        }
        composable(route = BottomBarScreens.Search.route){

        }
        composable(route = BottomBarScreens.Favorites.route){

        }
        composable(route = BottomBarScreens.Cart.route){

        }
        composable(route = BottomBarScreens.Account.route){

        }
    }
}