package com.raconz.tugasUI1.view.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.raconz.tugasUI1.R
import com.raconz.tugasUI1.model.farm
import com.raconz.tugasUI1.ui.theme.TugasUI1Theme

@Composable
fun FarmItems(
    farm: farm,
    onItemClicked: (Int) -> Unit
) {
    Image(
        painter = painterResource(farm.image),
        contentDescription = farm.name,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clickable {
                onItemClicked(farm.id)
            }
    )
}

@Preview(showBackground = true)
@Composable
private fun FarmItemsPreview() {
    TugasUI1Theme {
        FarmItems(
            farm = farm(
                1, "apel",
                R.drawable.farm_apple,
                "Ini Kebun apell"
            ),
            onItemClicked = { farmId ->
                println("Id Farm = $farmId")
            }
        )
    }
}