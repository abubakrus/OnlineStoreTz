package com.example.onlinestore.presentation.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.onlinestore.presentation.navigation.AppNavGraph
import kotlinx.coroutines.flow.Flow


@Composable
fun OnlineStoreComposeApp(
    destinationFlow: Flow<Pair<String, Boolean>>,
    modifier: Modifier = Modifier
) {
    val navHostController = rememberNavController()


    val (destination, isClearBackStack) = destinationFlow.collectAsState(initial = "" to false).value

    if (destination.isNotEmpty()) {
        navHostController.navigate(destination) {
            if (isClearBackStack) popUpTo(0)
        }
    }
    Scaffold(
        modifier = modifier.fillMaxSize()
    ) { innerPaddings ->
        AppNavGraph(navHostController = navHostController,
            modifier=modifier.padding(innerPaddings))

    }
}