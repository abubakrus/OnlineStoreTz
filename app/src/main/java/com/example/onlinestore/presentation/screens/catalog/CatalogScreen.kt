package com.example.onlinestore.presentation.screens.catalog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.onlinestore.R
import com.example.onlinestore.presentation.components.TabBar
import com.example.onlinestore.presentation.screens.catalog.models.CatalogScreenHeaderContentLeft
import com.example.onlinestore.presentation.screens.catalog.models.CatalogScreenHeaderContentRight
import com.example.onlinestore.presentation.screens.catalog.models.SortByItems
import com.example.onlinestore.presentation.theme.ExtraLargeSpacing
import com.example.onlinestore.presentation.theme.LargeSpacing

@Composable
fun CatalogScreen(
    onFilterClick: (SortByItems) -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TabBar(title = stringResource(id = R.string.catalog))
        }
    ) { innerPaddings ->
        Column(
            modifier = Modifier.padding(innerPaddings)
        ) {
            CatalogScreenMainContent(onFilterClick = onFilterClick)
        }
    }
}


@Composable
fun CatalogScreenMainContent(
    onFilterClick: (SortByItems) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
    )
    {
        Spacer(modifier = Modifier.height(ExtraLargeSpacing))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = LargeSpacing),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            CatalogScreenHeaderContentLeft(onFilterClick = onFilterClick)
            Spacer(modifier = Modifier.weight(1f))
            CatalogScreenHeaderContentRight()
        }
    }
}
