package com.itgonca.groceriesapp.ui.navigation.screens

sealed class Screens(val route:String){
    object SplashScreen:Screens("splash_screen")
    object IntroductoryScreen:Screens("introductory_screen")
}
