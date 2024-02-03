package com.example.onlinestore.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.onlinestore.presentation.theme.ExtraSmallSpacing
import com.example.onlinestore.presentation.theme.LargeSpacing
import com.example.onlinestore.presentation.theme.MediumSpacing
import com.example.onlinestore.presentation.theme.SF_Pro_Display_Fonts


@Composable
fun TabBar(
    title: String? = String(),
    modifier: Modifier = Modifier,
    alignment: Alignment = Alignment.CenterStart,
    startIcon: ImageVector? = null,
    endIcon: ImageVector? = null,
    startIconClick: () -> Unit = {},
    endIconClick: () -> Unit = {},
) {
    Surface(
        modifier = modifier
            .statusBarsPadding()
            .fillMaxWidth()
            .padding(horizontal = LargeSpacing)
            .padding(top = MediumSpacing, bottom = ExtraSmallSpacing),
        color = MaterialTheme.colorScheme.surface
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = MediumSpacing,
                    bottom = ExtraSmallSpacing
                ),
        ) {
            if (startIcon != null) {
                TabBarIcon(
                    modifier = Modifier
                        .align(Alignment.TopStart),
                    icon = startIcon,
                    onClick = startIconClick,
                )
            }
            if (title != null) Text(
                modifier = Modifier.align(Alignment.TopCenter),
                text = title,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onBackground,
                fontFamily = SF_Pro_Display_Fonts,
                fontWeight = FontWeight.Medium
            )
            if (endIcon != null) {
                TabBarIcon(
                    modifier = Modifier
                        .align(Alignment.CenterEnd),
                    icon = endIcon,
                    onClick = endIconClick,
                )
            }
        }
    }
}

@Composable
fun TabBarIcon(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .size(32.dp)
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = CircleShape
            )
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.background)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier.size(16.dp),
            imageVector = icon,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.onBackground
        )
    }
}