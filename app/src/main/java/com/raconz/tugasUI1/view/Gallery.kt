package com.raconz.tugasUI1.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.raconz.tugasUI1.data.AppData
import com.raconz.tugasUI1.model.farm
import com.raconz.tugasUI1.navigation.Screen
import com.raconz.tugasUI1.ui.theme.TugasUI1Theme
import com.raconz.tugasUI1.view.component.FarmItems

@Composable
fun Gallery(
    navController: NavController,
    modifier: Modifier = Modifier,
    gallery: List<farm> = AppData.farmList
) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(200.dp),
        verticalItemSpacing = 5.dp,
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(gallery, key = { it.id }) {
            FarmItems(farm = it) {farmId ->
                navController.navigate(Screen.farmDetail.route + "/$farmId")
            }
        }
    }
}
