package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.myapplication.ui.theme.Shapes

@OptIn(ExperimentalUnitApi::class)
@Composable
fun ImageHeader() {
    ConstraintLayout {
        val (image, text) = createRefs()

        val images: Painter = painterResource(id = R.drawable.img)
        Image(
            painter = images,
            contentDescription = "",
            modifier = Modifier.constrainAs(image) {
                start.linkTo(parent.start)
                bottom.linkTo(parent.bottom)
            }
                .height(120.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop,
        )
        Text(
            text = "바나나 카라멜 프라푸치노와\n동심 가득한 가을을 만들어요",
            modifier = Modifier.constrainAs(text) {
                start.linkTo(image.start, margin = 20.dp)
                bottom.linkTo(image.bottom, margin = 20.dp)
            },
            style = TextStyle(
                color = Color.Black,
                fontWeight = FontWeight.W900,
                fontStyle = FontStyle.Normal,
                fontSize = TextUnit(value = 5f, type = TextUnitType.Em)
            )
        )
    }
}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun StarHeader() {
    ConstraintLayout {
        val (left,right) = createRefs()
        Column(
            modifier = Modifier.constrainAs(left) {
                start.linkTo(parent.start, margin = 0.dp)
            }
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = buildAnnotatedString {
                    withStyle(
                        SpanStyle(
                            color = darkColor(),
                            fontWeight = FontWeight.W600
                        )
                    ) {
                        append("25")
                    }
                    append(" ⭐")
                    withStyle(
                        SpanStyle(
                            color = darkColor(),
                            fontWeight = FontWeight.W600,
                        )
                    ) {
                        append("until Gold Level")
                    }
                }
            )
            ProgressBar()
            ClickBar()
        }

        Column(
            modifier = Modifier.constrainAs(right) {
                end.linkTo(parent.end, margin = 10.dp)
            }
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(
                        SpanStyle(
                            fontWeight = FontWeight.W600,
                            fontSize = TextUnit(value = 2.5f, type = TextUnitType.Em)
                        )
                    ) {
                        append("0")
                    }

                    withStyle(
                        SpanStyle(
                            color = Color.LightGray,
                            fontSize = TextUnit(value = 1.5f, type = TextUnitType.Em)
                        )
                    ) {
                        append("/")
                    }

                    withStyle(
                        SpanStyle(
                            color = darkColor(),
                            fontWeight = FontWeight.W500,
                            fontSize = TextUnit(value = 1.5f, type = TextUnitType.Em)
                        )
                    ) {
                        append("25⭐")
                    }
                }
            )
        }
    }
}


@Composable
fun SliderMinimalExample(result: Float) {
    val sliderPosition by remember { mutableStateOf(result) }
    Column {
        Slider(
            value = sliderPosition,
            onValueChange = { }
        )
        Text(text = sliderPosition.toString())
    }
}

@Composable
fun ProgressBar() {
    val progressPosition by remember { mutableStateOf(0f) }
    LinearProgressIndicator(
        progress = progressPosition,
        color = darkColor(),
        backgroundColor = Color.LightGray,
        modifier = Modifier
            .fillMaxWidth(fraction =  0.65f)
            .padding(bottom = 10.dp)
            .clip(Shapes.medium)
            .height(10.dp)

    )
}

@Composable
fun ClickBar() {
    ConstraintLayout(
        modifier = Modifier.fillMaxWidth()
    ) {
        val (message, coupon, notice) = createRefs()
        Row(
            modifier = Modifier.constrainAs(message) {
                start.linkTo(parent.start)
            }
        ) {
            Icon(
                Icons.Outlined.Email,
                contentDescription = "message Icon"
            )
            Text(
                text = "What's new",
                color = Color.Black
            )
        }

        Row(
            modifier = Modifier.constrainAs(coupon) {
                start.linkTo(message.end, margin = 20.dp)
            }
        ) {
            Icon(
                Icons.Outlined.CheckCircle,
                contentDescription = "coupon"
            )

            Text(
                text = "Coupon",
                color = Color.Black
            )
        }

        Row(
            modifier = Modifier.constrainAs(notice) {
                end.linkTo(parent.end, margin = 10.dp)
            }
        ) {
            Icon(
                Icons.Outlined.Notifications,
                contentDescription = "notice",
            )
        }
    }
}

fun darkColor(): Color {
    return Color(0xFF4FAE6E)
}