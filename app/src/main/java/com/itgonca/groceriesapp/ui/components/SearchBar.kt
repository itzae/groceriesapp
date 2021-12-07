package com.itgonca.groceriesapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.itgonca.groceriesapp.ui.base.InputStateHolder
import com.itgonca.groceriesapp.ui.base.rememberInputState
import com.itgonca.groceriesapp.ui.theme.Grey70
import com.itgonca.groceriesapp.ui.theme.GroceriesAppTheme
import com.itgonca.groceriesapp.ui.theme.LightGrey30

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    state: InputStateHolder = rememberInputState(hint = "Search store")
) {
    Surface(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(LightGrey30),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search bar",
                tint = Color.Black, modifier = Modifier.padding(start = 12.dp)
            )
            BasicTextField(
                value = state.text,
                onValueChange = {
                    if (state.isHint) state.text = "" else state.text = it
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, top = 16.dp, bottom = 16.dp),
                textStyle = MaterialTheme.typography.subtitle2.copy(color = if (state.isHint) Grey70 else Color.Black)
            )
        }

    }
}

@Preview(name = "Search bar")
@Composable
fun SearchbarPreview(){
    GroceriesAppTheme {
        SearchBar()
    }
}