package com.example.onlinestore.presentation.navigation.app_nav_graph

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.onlinestore.presentation.navigation.AppBottomNavigation
import com.example.onlinestore.presentation.navigation.BottomTab
import com.example.onlinestore.presentation.screens.basket.BasketScreen
import com.example.onlinestore.presentation.screens.basket.BasketScreenViewModel
import com.example.onlinestore.presentation.screens.catalog.CatalogScreen
import com.example.onlinestore.presentation.screens.catalog.CatalogViewModel
import com.example.onlinestore.presentation.screens.main.MainScreen
import com.example.onlinestore.presentation.screens.main.MainScreenViewModel
import com.example.onlinestore.presentation.screens.profile.ProfileScreen
import com.example.onlinestore.presentation.screens.profile.ProfileScreenViewModel
import com.example.onlinestore.presentation.screens.stock.StockScreen
import com.example.onlinestore.presentation.screens.stock.StockScreenViewModel


const val MAIN_NAV_GRAPH_ROUTE = "main_nav_graph_route"


@Composable
fun MainNavGraph() {
    val navHostController = rememberNavController()
    Scaffold(bottomBar = {
        AppBottomNavigation(navController = navHostController)
    }) { innerPaddings ->
        NavHost(
            modifier = Modifier.padding(bottom = innerPaddings.calculateBottomPadding()),
            navController = navHostController,
            startDestination = BottomTab.CATALOG.route
        ) {
            composable(BottomTab.MAIN.route) {
                val viewModel: MainScreenViewModel = hiltViewModel()
                viewModel
                MainScreen()
            }
            composable(BottomTab.CATALOG.route) {
                val viewModel: CatalogViewModel = hiltViewModel()
                viewModel
                CatalogScreen(onFilterClick = {})
            }
            composable(BottomTab.BASKET.route) {
                val viewModel: BasketScreenViewModel = hiltViewModel()
                viewModel
                BasketScreen()
            }
            composable(BottomTab.STOCK.route) {
                val viewModel: StockScreenViewModel = hiltViewModel()
                viewModel
                StockScreen()
            }
            composable(BottomTab.PROFILE.route) {
                val viewModel: ProfileScreenViewModel = hiltViewModel()
                viewModel
                ProfileScreen()
            }
        }
    }
}
