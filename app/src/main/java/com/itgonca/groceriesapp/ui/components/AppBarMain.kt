package com.itgonca.groceriesapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.itgonca.groceriesapp.R
import com.itgonca.groceriesapp.ui.theme.GroceriesAppTheme

@Composable
fun AppBarMain(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_orange_carrot),
            contentDescription = "Icon appbar", modifier = Modifier.size(40.dp, 40.dp)
        )
        Row(modifier = Modifier.padding(top = 16.dp)) {
            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "icon location")
            Text(text = "Dhaka, Banassre", style = MaterialTheme.typography.h6)
        }
        SearchBar(modifier = Modifier.padding(top = 24.dp))
    }
}

@Preview(name = "AppBarMainPreview")
@Composable
fun AppBarMainPreview() {
    GroceriesAppTheme {
        AppBarMain()
    }
}