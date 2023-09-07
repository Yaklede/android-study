package com.example.myapplication

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


enum class MainTap {
    HOME, PAY, ORDER, SHOP, OTHER
}

@Composable
fun Navigator() {
    val navController = rememberNavController()
    BottomNavigationBar(navController)
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    var selectedItem by remember { mutableStateOf(0) }
    BottomNavigation(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 8.dp
    ) {
        BottomNavigationItem(
            icon = {
                Icon(
                    Icons.Default.Home,
                    contentDescription = "Home",
                )
            },
            label = {
                Text(text = "Home")
            },
            unselectedContentColor = nonClickColor(),
            selectedContentColor = clickColor(),
            selected = selectedItem == 0,
            onClick = {
                selectedItem = 0
            }
        )

        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(R.drawable.icon_credit_card), contentDescription = "Pay",
                    modifier = Modifier
                        .size(24.dp)
                )
            },
            label = {
                Text(text = "Pay")
            },
            unselectedContentColor = nonClickColor(),
            selectedContentColor = clickColor(),
            selected = selectedItem == 1,
            onClick = { selectedItem = 1 }
        )

        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(R.drawable.icon_coffee_cup), contentDescription = "Order",
                    modifier = Modifier
                        .size(24.dp)
                )
            },
            label = {
                Text(text = "Order")
            },
            unselectedContentColor = nonClickColor(),
            selectedContentColor = clickColor(),
            selected = selectedItem == 2,
            onClick = { selectedItem = 2 }
        )

        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(R.drawable.icon_shopping_papper_bag), contentDescription = "Shop",
                    modifier = Modifier
                        .size(24.dp)
                )
            },
            label = {
                Text(text = "Shop")
            },
            unselectedContentColor = nonClickColor(),
            selectedContentColor = clickColor(),
            selected = selectedItem == 3,
            onClick = { selectedItem = 3 }
        )

        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(R.drawable.icon_menu), contentDescription = "Other",
                    modifier = Modifier
                        .size(24.dp)
                )
            },
            label = {
                Text(text = "Other")
            },
            unselectedContentColor = nonClickColor(),
            selectedContentColor = clickColor(),
            selected = selectedItem == 4,
            onClick = { selectedItem = 4 }
        )
    }
}

fun nonClickColor(): Color {
    return Color(0xFF434342)
}

fun clickColor(): Color {
    return Color(0xFF4BA669)
}
