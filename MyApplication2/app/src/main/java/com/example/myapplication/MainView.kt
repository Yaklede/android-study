package com.example.myapplication

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainView() {
    Box(
        modifier = Modifier
            .verticalScroll(state =  rememberScrollState())
    ) {
//        Scaffold(
//            bottomBar = {
//                Navigator()
//            }
//        ) {
            Column {
                Row {
                    ImageHeader()
                }
                Row {
                    StarHeader()
                }
                Row {
                    Banner()
                }
                Row {
                    RecommendedMenu("야크르드")
                }
                Row {
                    BottomBanner()
                }
            }
        }
//    }
}