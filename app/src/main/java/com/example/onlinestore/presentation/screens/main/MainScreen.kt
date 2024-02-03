package com.example.onlinestore.presentation.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.onlinestore.R
import com.example.onlinestore.presentation.components.TabBar


@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TabBar(title = stringResource(id = R.string.main))
        }
    ) { innerPaddings ->
        Column(
            modifier = modifier.padding(innerPaddings)
        ) {

        }
    }

}