package com.itgonca.groceriesapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.itgonca.groceriesapp.ui.components.AppBarMain
import com.itgonca.groceriesapp.ui.components.BottomBarNavigation
import com.itgonca.groceriesapp.ui.navigation.BottomBarNavGraph
import com.itgonca.groceriesapp.ui.theme.GroceriesAppTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            GroceriesAppTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(topBar = {
                    AppBarMain(modifier = Modifier.padding(start = 8.dp, end = 8.dp))
                }, bottomBar = {
                    BottomBarNavigation(navController = navController)
                }) { paddingValues ->
                    BottomBarNavGraph(navController = navController, paddingValues)
                }
            }
        }
    }
}
