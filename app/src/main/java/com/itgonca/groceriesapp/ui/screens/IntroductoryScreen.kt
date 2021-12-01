package com.itgonca.groceriesapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.itgonca.groceriesapp.R
import com.itgonca.groceriesapp.ui.theme.GroceriesAppTheme

@Composable
fun IntroductoryScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.introductory_background),
            contentDescription = "Introductory background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_carrot),
                contentDescription = "Carrot icon",
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = "Welcome \n to our store",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.h1.copy(color = Color.White)
            )
            Text(
                text = "Get you groceries in as fast one hour",
                style = MaterialTheme.typography.body1.copy(color = Color.White),
                modifier = Modifier.padding(top = 8.dp, bottom = 24.dp)
            )
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.secondary),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp, bottom = 24.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "Get Started", Modifier.padding(top = 12.dp, bottom = 12.dp))
            }
        }

    }
}

@Preview(name = "IntroductoryScreen")
@Composable
fun IntroductoryScreenPreview() {
    GroceriesAppTheme {
        IntroductoryScreen()
    }
}