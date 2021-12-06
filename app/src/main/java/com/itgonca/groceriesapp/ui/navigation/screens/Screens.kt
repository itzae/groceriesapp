package com.itgonca.groceriesapp.ui.navigation.screens

sealed class Screens(val route:String){
    object SplashGroceriesScreen:Screens("splash_screen")
    object IntroductoryScreen:Screens("introductory_screen")
    object LoginScreen:Screens("login_screen")
}
