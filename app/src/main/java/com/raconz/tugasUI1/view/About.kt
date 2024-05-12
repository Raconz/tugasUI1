package com.raconz.tugasUI1.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.raconz.tugasUI1.R
import com.raconz.tugasUI1.ui.theme.TugasUI1Theme

@Composable
fun About(
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(10.dp)

    ) {
        Image(painter = painterResource(id = R.drawable.profile), contentDescription = "Ahmat Fauzi")
        Spacer(modifier = Modifier.width(10.dp))
        Column(
            modifier = modifier
        ) {
            Text(text = "Nama : Ahmat Fauzi", style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Email : Ahmat.04112000@gmail.com", style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Universitas : Universitas Sains Al - Qur'an", style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Jurusan : Teknik Informatika", style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AboutPreview() {
    TugasUI1Theme {
        About()
    }
}