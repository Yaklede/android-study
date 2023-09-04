package com.example.myapplication

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp

@Composable
fun MainView() {
    Card(
        modifier = Modifier.fillMaxWidth()
            .padding(15.dp)
            .clickable { },
        elevation = 10.dp
    ) {
        Column(modifier = Modifier.padding(15.dp)) {
            Text(
                buildAnnotatedString {
                    append("this is welcome text")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.W900, color = Color.Black)) {
                        append("this is inner text")
                    }
                }
            )
            Text(
                buildAnnotatedString {
                    append("Now you are in the ")
                    withStyle(
                        SpanStyle(
                            fontWeight = FontWeight.W400
                        )
                    ) {
                        append("card \n")
                    }
                    append(" section")
                }
            )
        }
    }
}