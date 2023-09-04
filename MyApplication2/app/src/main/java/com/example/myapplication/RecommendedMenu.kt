package com.example.myapplication

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.scale
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
        LazyRow {
            items(count = 10) { index ->
                Canvas(
                    modifier = Modifier.width(70.dp)
                        .height(70.dp)
                ) {
                    scale(scaleX = 1.5f, scaleY = 1.5f) {
                        drawCircle(color = backGroundColor(), radius = 20.dp.toPx())
                    }
                }
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