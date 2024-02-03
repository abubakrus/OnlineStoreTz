package com.example.onlinestore.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.onlinestore.R


val SF_Pro_Display_Fonts = FontFamily(
    Font(R.font.sf_pro_display_medium, FontWeight.Medium),
    Font(R.font.sf_pro_display_regular, FontWeight.Normal)
)


val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = SF_Pro_Display_Fonts,
        fontSize = 36.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = SF_Pro_Display_Fonts,
        fontSize = 32.sp,
    ),
    headlineLarge = TextStyle(
        fontFamily = SF_Pro_Display_Fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = SF_Pro_Display_Fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 26.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = SF_Pro_Display_Fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
    ),

    titleLarge = TextStyle(
        fontFamily = SF_Pro_Display_Fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = SF_Pro_Display_Fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = SF_Pro_Display_Fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
    ),

    bodyLarge = TextStyle(
        fontFamily = SF_Pro_Display_Fonts,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = SF_Pro_Display_Fonts,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = SF_Pro_Display_Fonts,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
    ),
)