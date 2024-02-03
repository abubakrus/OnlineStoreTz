package com.example.onlinestore.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.onlinestore.presentation.navigation.app_nav_graph.MAIN_NAV_GRAPH_ROUTE
import com.example.onlinestore.presentation.navigation.app_nav_graph.MainNavGraph
import com.example.onlinestore.presentation.screens.auth.SignUpDestination
import com.example.onlinestore.presentation.screens.auth.SignUpScreen
import com.example.onlinestore.presentation.screens.auth.SignUpViewModel


@Composable
fun AppNavGraph(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = SignUpDestination.route()
    ) {
        composable(SignUpDestination.route()) {
            val viewModel: SignUpViewModel = hiltViewModel()
            val uiState by viewModel.uiState.collectAsStateWithLifecycle()
            val navCommand by viewModel.navCommandFlow.collectAsStateWithLifecycle(initialValue = null)

            LaunchedEffect(key1 = navCommand) {
                if (navCommand != null) navHostController.navigate(navCommand!!)
            }
            SignUpScreen(
                onClickToMain = {
                    navHostController.navigate(MAIN_NAV_GRAPH_ROUTE)
                }, uiState = uiState,
                onEvent = viewModel::onEvent
            )
        }
        composable(MAIN_NAV_GRAPH_ROUTE) {
            MainNavGraph()
        }
    }
}