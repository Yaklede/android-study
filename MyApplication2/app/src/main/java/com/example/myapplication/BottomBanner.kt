package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun BottomBanner() {
    val banner1: Painter = painterResource(R.drawable.ads_banner_bottom_1)
    val banner2: Painter = painterResource(R.drawable.ads_banner_bottom_2)
    Column(
        modifier = Modifier.padding(
            horizontal = 10.dp, vertical = 0.dp
        )
    ) {
        ConstraintLayout {
            val (ad1, ad2) = createRefs()
            Image(
                painter = banner1,
                contentDescription = "하단배너1",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .constrainAs(ad1) {
                        top.linkTo(parent.top, margin = 10.dp)
                    }
                    .fillMaxWidth()
                    .shadow(5.dp)
            )

            Image(
                painter = banner2,
                contentDescription = "하단배너2",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .constrainAs(ad2) {
                        top.linkTo(ad1.bottom, margin = 10.dp)
                    }
                    .fillMaxWidth()
                    .shadow(5.dp)
            )
        }

    }

}