package com.raconz.tugasUI1.view.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.raconz.tugasUI1.R
import com.raconz.tugasUI1.model.veg
import com.raconz.tugasUI1.ui.theme.TugasUI1Theme

@Composable
fun VegItems(
    veg: veg,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .clickable {
                onItemClicked(veg.id)
            }
            .border(2.dp, Color.Black, RectangleShape)
    ) {
        Image(
            painter = painterResource(id = veg.image),
            contentDescription = veg.name, modifier = Modifier
                .clip(RectangleShape)
                .size(88.dp)
        )
        Text(
            text = veg.name,
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(88.dp),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun VegItemsPreview() {
    TugasUI1Theme {
        VegItems(
            veg = veg(
                1,
                "Bawang Merah",
                R.drawable.veg_bawang_merah,
                "Bawang merah (Allium cepa L. var. aggregatum[1]) adalah salah satu bumbu masak utama dunia yang berasal dari Iran, Pakistan, dan pegunungan-pegunungan di sebelah utaranya, tetapi kemudian menyebar ke berbagai penjuru dunia, baik sub-tropis maupun tropis. Wujudnya berupa umbi yang dapat dimakan mentah, untuk bumbu masak, acar, obat tradisional, kulit umbinya dapat dijadikan zat pewarna dan daunnya dapat pula digunakan untuk campuran sayur. Tanaman penghasilnya disebut dengan nama sama."
            ),
            onItemClicked = { vegId ->
                println("veg Id = $vegId")
            }
        )
    }
}