package com.example.onlinestore.presentation.screens.basket

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.onlinestore.R
import com.example.onlinestore.presentation.components.TabBar

@Composable
fun BasketScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TabBar(title = stringResource(id = R.string.basket))
        }
    ) { innerPaddings ->
        Column(
            modifier = modifier.padding(innerPaddings)
        ) {

        }
    }
}