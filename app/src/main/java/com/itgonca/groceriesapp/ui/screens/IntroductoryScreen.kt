package com.itgonca.groceriesapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.itgonca.groceriesapp.R

@Composable
fun IntroductoryScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.introductory_background),
            contentDescription = "Introductory background"
        )
        Column(modifier = Modifier.align(Alignment.BottomCenter),horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_carrot),
                contentDescription = "Carrot icon"
            )
            Text(text = "Welcome to our store", textAlign = TextAlign.Center)
        }

    }
}

@Preview(name = "IntroductoryScreen")
@Composable
fun IntroductoryScreenPreview() {
    IntroductoryScreen()
}