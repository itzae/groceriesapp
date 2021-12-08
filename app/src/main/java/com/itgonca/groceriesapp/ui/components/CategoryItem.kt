package com.itgonca.groceriesapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.itgonca.groceriesapp.R
import com.itgonca.groceriesapp.ui.theme.GroceriesAppTheme
import com.itgonca.groceriesapp.ui.theme.Orange25

@Composable
fun CategoryItem() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .width(248.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(Orange25)
    ) {
        Image(
            painter = painterResource(id = R.drawable.pulses_img),
            contentDescription = "Image category",
            Modifier
                .weight(1f)
                .padding(start=8.dp, end = 8.dp, top = 16.dp, bottom = 16.dp)
        )
        Text(
            text = "Pulses",
            Modifier.weight(2f).padding(start = 8.dp),
            style = MaterialTheme.typography.h5.copy(fontSize = 20.sp)
        )
    }
}


@Preview(name = "CategoryItem", showBackground = true)
@Composable
fun CategoryItemPreview() {
    GroceriesAppTheme {
        CategoryItem()
    }
}

@Preview(name = "CategoryItemList", showBackground = true)
@Composable
fun CategoryItemListPreview() {
    GroceriesAppTheme {
        LazyRow(content = {
            items(3) {
                CategoryItem()
            }
        })
    }
}