package com.itgonca.groceriesapp.ui.navigation.screens

import com.itgonca.groceriesapp.R

sealed class BottomBarScreens(
    val route: String,
    val title: String,
    val iconSelected: Int
) {
    object Home : BottomBarScreens(
        route = "shop",
        title = "Shop",
        iconSelected = R.drawable.ic_home
    )

    object Search : BottomBarScreens(
        route = "explore",
        title = "Explore",
        iconSelected = R.drawable.ic_explore
    )

    object Cart : BottomBarScreens(
        route = "chat",
        title = "Chat",
        iconSelected = R.drawable.ic_cart
    )

    object Favorites : BottomBarScreens(
        route = "favourite",
        title = "Favourite",
        iconSelected = R.drawable.ic_favorite
    )
    object Account : BottomBarScreens(
        route = "account",
        title = "Account",
        iconSelected = R.drawable.ic_account
    )
}
