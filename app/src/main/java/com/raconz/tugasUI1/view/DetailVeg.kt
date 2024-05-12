package com.raconz.tugasUI1.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.raconz.tugasUI1.data.AppData
import com.raconz.tugasUI1.model.veg

@Composable
fun DetailVeg(
    modifier: Modifier = Modifier,
    navController: NavController,
    vegId: Int?
) {
    val newVegList = AppData.vegLists.filter { veg ->
        veg.id == vegId
    }
    Column(
        modifier = modifier
    ) {
        DetailVegContent(newVegList = newVegList)
    }
}

@Composable
private fun DetailVegContent(
    newVegList: List<veg>,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .padding(10.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = modifier.padding(10.dp)
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(data = newVegList[0].image)
                    .build(),
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(height = 100.dp, width = 150.dp),
                contentDescription = "Gambar Sayur"
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = newVegList[0].name, fontSize = 25.sp, fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = newVegList[0].description, style = MaterialTheme.typography.bodySmall)
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailVegPreview(){
    DetailVegContent(newVegList = AppData.vegLists)
}