package com.example.onlinestore.presentation.screens.catalog.models

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.onlinestore.R


@Composable
fun FilterPopup(
    modifier: Modifier = Modifier,
    onClick: (SortByItems) -> Unit,
) {
    DropdownMenu(
        modifier = modifier
            .background(MaterialTheme.colorScheme.surface)
            .padding(horizontal = 8.dp),
        expanded = true,
        onDismissRequest = {},
    ) {
        DropDownOptionItem(
        textId = R.string.descending_order,
        onClick = { onClick(SortByItems.BY_RATING_DOWN) }
        )
        Divider()
        DropDownOptionItem(
            textId = R.string.descending_order_price,
            onClick = { onClick(SortByItems.BY_PRICE_DOWN) },
        )
        Divider()
        DropDownOptionItem(
            textId = R.string.by_price_increasing,
            onClick = { onClick(SortByItems.BY_PRICE_INCREASING) }
        )
    }
}

@Composable
fun DropDownOptionItem(
    modifier: Modifier = Modifier,
    @StringRes textId: Int,
    onClick: () -> Unit,
) {
    DropdownMenuItem(
        text = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = textId),
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                )
            }
            Spacer(modifier = modifier.height(8.dp))
        },
        onClick = onClick
    )

}