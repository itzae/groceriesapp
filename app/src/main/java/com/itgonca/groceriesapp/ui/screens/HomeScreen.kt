package com.itgonca.groceriesapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.itgonca.groceriesapp.R
import com.itgonca.groceriesapp.ui.components.CardItemGrocery
import com.itgonca.groceriesapp.ui.theme.Green100
import com.itgonca.groceriesapp.ui.theme.GroceriesAppTheme

@Composable
fun HomeScreen() {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        item {
            Image(
                painter = painterResource(id = R.drawable.banner_home),
                contentDescription = "Banner home",
                modifier = Modifier.padding(top = 24.dp, start = 16.dp, end = 16.dp)
            )
        }
        item {
            OfferSection(modifier = Modifier.padding(top = 24.dp))
        }
    }
}

@Composable
fun OfferSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Exclusive Offer", style = MaterialTheme.typography.h5)
            Text(
                text = "See all",
                style = MaterialTheme.typography.subtitle1.copy(color = Green100)
            )
        }
        LazyRow(content = {
            items(5){
                CardItemGrocery()
            }
        })
    }
}

@Preview(name = "HomeScreenPreview", showBackground = true)
@Composable
fun HomeScreenPreview() {
    GroceriesAppTheme { HomeScreen() }
}

@Preview(name = "OfferSectionPreview", showBackground = true)
@Composable
fun OfferSectionPreview() {
    GroceriesAppTheme { OfferSection() }
}