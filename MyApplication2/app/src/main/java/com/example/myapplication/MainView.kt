package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainView() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            Navigator()
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(state = rememberScrollState())
        ) {
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
}