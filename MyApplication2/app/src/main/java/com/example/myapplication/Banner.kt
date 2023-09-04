package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.Shapes

@Composable
fun Banner() {
    val image: Painter = painterResource(id = R.drawable.ads_banner)
    Image(
        painter = image,
        contentDescription = "banner Image",
        modifier = Modifier
            .fillMaxWidth()
            .clip(Shapes.small)
            .height(70.dp),

        contentScale = ContentScale.FillWidth
    )
}