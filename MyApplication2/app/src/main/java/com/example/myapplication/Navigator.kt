package com.example.myapplication

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


enum class MainTap {
    HOME, PAY, ORDER, SHOP, OTHER
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Navigator() {
    val navController = rememberNavController()
    BottomNavigationBar(navController)
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    var selectedItem by remember { mutableStateOf(0) }
    BottomNavigation(
        modifier = Modifier.fillMaxSize(),
        contentColor = MaterialTheme.colors.primary,
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 8.dp
    ) {
        BottomNavigationItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text(text = "Home") },
            selected = selectedItem == 0,
            onClick = { selectedItem = 0 }
        )

        BottomNavigationItem(
            icon = { Icon(Icons.Default.Search, contentDescription = "Search") },
            label = { Text(text = "Search") },
            selected = selectedItem == 1,
            onClick = { selectedItem = 1 }
        )

        BottomNavigationItem(
            icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
            label = { Text(text = "Profile") },
            selected = selectedItem == 2,
            onClick = { selectedItem = 2 }
        )
    }
}
