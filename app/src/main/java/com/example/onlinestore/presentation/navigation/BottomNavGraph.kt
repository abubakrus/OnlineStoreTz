package com.example.onlinestore.presentation.navigation

import androidx.annotation.DrawableRes
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.onlinestore.R
import com.example.onlinestore.presentation.theme.Black
import com.example.onlinestore.presentation.theme.Pink


private const val DEFAULT_ICON_SIZE = 36


enum class BottomTab(
    @DrawableRes val icon: Int,
    val title: String,
    val route: String
) {
    MAIN(
        icon = R.drawable.home_icon,
        title =  "Главная",
        route = "main_screen_route"
    ),
    CATALOG(
        icon = R.drawable.catalog_default,
        title = "Каталог",
        route = "catalog_screen_route"
    ),
    BASKET(
        icon = R.drawable.bag_default,
        title = "Корзина",
        route = "basket_screen_route"
    ),
    STOCK(
        icon = R.drawable.discount_default,
        title = "Акции",
        route = "stock_screen_route"
    ),
    PROFILE(
        icon = R.drawable.account_default,
        title = "Профиль",
        route = "profile_screen_route"
    )
}

@Composable
fun AppBottomNavigation(
    navController: NavHostController
) {
    val tabs = BottomTab.entries.toList()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    BottomNavigation(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = MaterialTheme.colorScheme.surface
    ) {
        tabs.forEach { bottomTab ->
            AppBottomNavigationItem(
                modifier = Modifier.weight(1f),
                selected = currentRoute == bottomTab.route,
                onClick = {
                    navController.navigate(bottomTab.route) {
                        launchSingleTop = true
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                    }
                },
                icon = painterResource(id = bottomTab.icon),
                title = bottomTab.title
            )
        }
    }
}

@Composable
fun AppBottomNavigationItem(
    selected: Boolean,
    onClick: () -> Unit,
    title: String,
    icon: Painter,
    modifier: Modifier = Modifier,
    iconSize: Dp = DEFAULT_ICON_SIZE.dp,
) {
    val scale = if (selected) 1.5f else 1.0f
    val color = if (selected) Pink
    else Black

    val animatedScale: Float by animateFloatAsState(
        targetValue = scale,
        animationSpec = TweenSpec(
            durationMillis = 500,
            easing = FastOutSlowInEasing
        ), label = ""
    )
    val animatedColor by animateColorAsState(
        targetValue = color,
        animationSpec = TweenSpec(
            durationMillis = 500,
            easing = FastOutSlowInEasing
        ), label = ""
    )
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IconButton(
            onClick = onClick,
            modifier = modifier.size(iconSize)
        ) {
            Icon(
                painter = icon,
                contentDescription = String(),
                tint = animatedColor,
                modifier = Modifier.scale(animatedScale)
            )
        }
        Text(
            text = title,
            style = MaterialTheme.typography.bodySmall.copy(
                color = color,
            )
        )
    }

}