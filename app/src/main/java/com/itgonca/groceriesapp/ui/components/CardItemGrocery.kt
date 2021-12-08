package com.itgonca.groceriesapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.itgonca.groceriesapp.R
import com.itgonca.groceriesapp.ui.theme.*

@Composable
fun CardItemGrocery() {
    Column(
        modifier = Modifier
            .width(170.dp)
            .padding(start = 8.dp, end = 8.dp)
            .border(width = 1.dp, shape = RoundedCornerShape(15.dp), color = LightGrey40),

        ) {
        Image(
            painter = painterResource(id = R.drawable.banana_item),
            contentDescription = "Image item",
            modifier = Modifier
                .padding(top = 16.dp)
                .align(CenterHorizontally)
        )
        Text(
            text = "Organic Bananas",
            style = MaterialTheme.typography.subtitle1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp, start = 8.dp, end = 8.dp)
        )
        Text(
            text = "7pcs, Priceg",
            style = MaterialTheme.typography.subtitle1.copy(fontSize = 14.sp, color = Grey60),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp, start = 8.dp, end = 8.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "$4.99", style = MaterialTheme.typography.h6)
            IconButton(
                onClick = { },
                modifier = Modifier
                    .clip(RoundedCornerShape(17.dp))
                    .background(Green100),
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_add_item),
                    contentDescription = "Add button",
                    modifier = Modifier.padding(8.dp),
                    tint = Color.White
                )
            }
        }

    }
}

@Preview(name = "CardItemGroceryPreview", showBackground = true)
@Composable
fun CardItemGroceryPreview() {
    GroceriesAppTheme {
        CardItemGrocery()
    }
}

@Preview(name = "CardItemGroceryListPreview", showBackground = true)
@Composable
fun CardItemGroceryListPreview() {
    GroceriesAppTheme {
        LazyRow(content = {
            items(5) {
                CardItemGrocery()
            }
        })
    }
}