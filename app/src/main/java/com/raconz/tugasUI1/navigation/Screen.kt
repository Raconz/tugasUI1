package com.raconz.tugasUI1.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("Home")
    data object Gallery : Screen("Gallery")
    data object About : Screen("About")
    data object vegDetail : Screen("veg_Detail")
    data object fruitDetail : Screen("fruit_Detail")
    data object farmDetail : Screen("farm_Detail")

}