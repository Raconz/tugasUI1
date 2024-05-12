package com.raconz.tugasUI1.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.BrowseGallery
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.raconz.tugasUI1.R
import com.raconz.tugasUI1.data.AppData
import com.raconz.tugasUI1.navigation.NavigationItem
import com.raconz.tugasUI1.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TugasApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val title = remember {
        mutableStateOf("Tugas App")
    }
    Scaffold(
        topBar = {
            if (title.value == "Tugas App" || title.value == "Gallery" || title.value == "Tentang Saya") {
                TopAppBar(
                    title = { Text(text = title.value) }                    )
            } else {
                TopAppBar(
                    title = { Text(text = title.value) },
                    navigationIcon =
                    {
                        IconButton(onClick = { navController.navigateUp() }) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBackIosNew,
                                contentDescription = "Back"
                            )
                        }
                    })
            }

        },
        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                Home(navController)
                title.value = "Tugas App"
            }
            composable(Screen.Gallery.route) {
                Gallery(navController = navController)
                title.value = "Gallery"
            }
            composable(Screen.About.route) {
                About()
                title.value = "Tentang Saya"
            }
            composable(
                Screen.vegDetail.route + "/{vegId}",
                arguments = listOf(navArgument("vegId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailVeg(
                    navController = navController,
                    vegId = navBackStackEntry.arguments?.getInt("vegId")
                )
                val newVegList = AppData.vegLists.filter { veg ->
                    veg.id == navBackStackEntry.arguments?.getInt("vegId")
                }
                title.value = "Detail Kebun " + newVegList[0].name
            }
            composable(
                Screen.fruitDetail.route + "/{fruitId}",
                arguments = listOf(navArgument("fruitId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailFruit(
                    navController = navController,
                    fruitId = navBackStackEntry.arguments?.getInt("fruitId")
                )
                val newFruitList = AppData.fruitList.filter { fruit ->
                    fruit.id == navBackStackEntry.arguments?.getInt("fruitId")
                }
                title.value = "Detail Buah " + newFruitList[0].name
            }
            composable(
                Screen.farmDetail.route + "/{farmId}",
                arguments = listOf(navArgument("farmId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailFarm(
                    navController = navController,
                    farmId = navBackStackEntry.arguments?.getInt("farmId")
                )
                val newFarmList = AppData.farmList.filter { farm ->
                    farm.id == navBackStackEntry.arguments?.getInt("farmId")
                }
                title.value = "Detail " + newFarmList[0].name
            }
        }
    }
}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItem = listOf(
            NavigationItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_gallery),
                icon = Icons.Default.BrowseGallery,
                screen = Screen.Gallery
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_about),
                icon = Icons.Default.Person,
                screen = Screen.About
            )
        )
        navigationItem.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id)
                        {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TugasAppPreview() {
    TugasApp()
}