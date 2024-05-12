package com.raconz.tugasUI1.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.raconz.tugasUI1.data.AppData
import com.raconz.tugasUI1.model.fruit
import com.raconz.tugasUI1.model.veg
import com.raconz.tugasUI1.navigation.Screen
import com.raconz.tugasUI1.view.component.FruitItems
import com.raconz.tugasUI1.view.component.VegItems

@Composable
fun Home(
    navController: NavController,
    modifier: Modifier = Modifier,
    Fruit: List<fruit> = AppData.fruitList,
    Veg: List<veg> = AppData.vegLists,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(5.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(Veg, key = { it.id }) {
                    VegItems(veg = it) { vegId ->
                        navController.navigate(Screen.vegDetail.route + "/$vegId")
                    }
                }
            }
        }
        items(Fruit, key = { it.id }) {
            FruitItems(fruit = it, modifier = modifier.padding(horizontal = 5.dp)) { fruitId ->
                navController.navigate(Screen.fruitDetail.route + "/$fruitId")
            }
        }
    }

}