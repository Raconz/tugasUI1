package com.raconz.tugasUI1.view.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.raconz.tugasUI1.R
import com.raconz.tugasUI1.model.fruit
import com.raconz.tugasUI1.ui.theme.TugasUI1Theme

@Composable
fun FruitItems(
    fruit: fruit, modifier: Modifier = Modifier, onItemClicked: (Int) -> Unit
) {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = modifier
        .fillMaxWidth()
        .border(2.dp, Color.Black, RectangleShape)
        .clickable {
            onItemClicked(fruit.id)
        }) {
        Image(
            painter = painterResource(id = fruit.image),
            contentDescription = fruit.name, modifier = Modifier
                .clip(RectangleShape)
                .border(2.dp, Color.Black, RectangleShape)
                .size(88.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = fruit.name,
            style = MaterialTheme.typography.titleMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun FruitItemsPreview() {
    TugasUI1Theme {
        FruitItems(
            fruit = fruit(
                1,
                "Apel",
                R.drawable.fruit_apple,
                "Apel, tufah, atau rantas merupakan jenis buah-buahan, atau buah yang dihasilkan dari pohon apel. Buah apel biasanya berwarna merah kulitnya jika masak dan siap dimakan, tetapi bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek dan daging buahnya keras. Buah apel memiliki beberapa biji di dalamnya."
            ),
            onItemClicked = { fruitId ->
                println("Id Buah = $fruitId")
            }
        )
    }
}