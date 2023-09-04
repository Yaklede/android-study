package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalUnitApi::class)
@Composable
fun RecommendedMenu(name: String) {
    Column {
        Text(
            modifier = Modifier
                .padding(10.dp),
            text = buildAnnotatedString {
                withStyle(
                    SpanStyle(
                        color = nameColor(),
                        fontSize = TextUnit(value = 1f, type = TextUnitType.Em)
                    )
                ) {
                    append(name)
                }
                withStyle(
                    SpanStyle(
                        color = Color.Black,
                        fontSize = TextUnit(value = 1f, type = TextUnitType.Em)
                    )
                ) {
                    append("님을 위한 추천 메뉴")
                }
            }
        )
        val imageModifier = Modifier
            .padding(10.dp)
            .size(80.dp)
            .clip(CircleShape)
        LazyRow {
            items(count = 10) { index ->
                Image(
                    painter = painterResource(R.drawable.coffee),
                    contentDescription = "coffee",
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                )
                Text(
                    text = "아이스 아메리카노"
                )
            }
        }
    }
}

fun nameColor(): Color {
    return Color(0xFF978363)
}

fun backGroundColor(): Color {
    return Color(0xFF213B31)
}