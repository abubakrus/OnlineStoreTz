package com.example.onlinestore.presentation.screens.catalog.models

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.onlinestore.R
import com.example.onlinestore.presentation.theme.Black
import com.example.onlinestore.presentation.theme.SmallSpacing


@Composable
fun CatalogScreenHeaderContentLeft(
    onFilterClick: (SortByItems) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        var isFilterClick by remember {
            mutableStateOf(false)
        }
        Row {
            Icon(
                painter = painterResource(id = R.drawable.sord_default),
                contentDescription = null,
                tint = Black,
                modifier = Modifier.padding(top = SmallSpacing)
            )
            Spacer(modifier = Modifier.width(SmallSpacing))
            Text(
                text = stringResource(id = R.string.by_popularity),
                style = MaterialTheme.typography.bodyLarge.copy(
                    color = Black
                )
            )
            if (isFilterClick) FilterPopup(onClick = { sort ->
                isFilterClick = false
                onFilterClick(sort)
            })
            Icon(
                modifier = modifier.clickable {
                    isFilterClick = !isFilterClick
                },
                painter = painterResource(id = R.drawable.down_arrow_default),
                contentDescription = null,
                tint = Black
            )

        }
    }
}

@Composable
fun CatalogScreenHeaderContentRight(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            Icon(
                painter = painterResource(id = R.drawable.filter_default),
                contentDescription = null,
                tint = Black,
            )
            Spacer(modifier = Modifier.width(SmallSpacing))
            Text(
                text = stringResource(id = R.string.filters),
                style = MaterialTheme.typography.bodyLarge.copy(
                    color = Black
                )
            )
        }
    }
}

@Preview
@Composable
fun CatalogScreenHeaderContentPreview() {
    MaterialTheme {
        CatalogScreenHeaderContentLeft(
            onFilterClick = {}
        )
    }
}
@Preview
@Composable
fun CatalogScreenHeaderContentRightPreview() {
    MaterialTheme {
        CatalogScreenHeaderContentRight()
    }
}


