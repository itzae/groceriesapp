package com.itgonca.groceriesapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.itgonca.groceriesapp.R

// Set of Material typography styles to start with
private val GilroyFont = FontFamily(
    Font(R.font.gilroy_semi_bold, FontWeight.SemiBold),
    Font(R.font.gilroy_medium, FontWeight.Medium),
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = GilroyFont,
        fontWeight = FontWeight.SemiBold,
        fontSize = 48.sp,
        lineHeight = 60.sp
    ),
    body1 = TextStyle(
        fontFamily = GilroyFont,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)