package com.itgonca.groceriesapp.ui.screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.itgonca.groceriesapp.R
import com.itgonca.groceriesapp.ui.navigation.screens.Screens
import com.itgonca.groceriesapp.ui.theme.Green100
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onNavigate: (String) -> Unit) {
    val scale = remember {
        Animatable(0f)
    }
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 1f,
            animationSpec = tween(
                durationMillis = 1000,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            ))
        delay(3000L)
        onNavigate(Screens.IntroductoryScreen.route)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Green100),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_nectar_logo_splash),
            contentDescription = "Logo splash",
            modifier = Modifier.scale(scale.value)
        )
    }
}

@Preview("splashScreen")
@Composable
fun SplashPreview() {
    SplashScreen {}
}