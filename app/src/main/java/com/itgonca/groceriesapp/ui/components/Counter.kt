package com.itgonca.groceriesapp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.itgonca.groceriesapp.R
import com.itgonca.groceriesapp.ui.theme.Green100
import com.itgonca.groceriesapp.ui.theme.Grey70
import com.itgonca.groceriesapp.ui.theme.GroceriesAppTheme
import com.itgonca.groceriesapp.ui.theme.LightGrey40

@Composable
fun CounterField() {

    var counterState by remember { mutableStateOf(0) }

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { if (counterState > 0) counterState-- }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_remove),
                contentDescription = "",
                tint = Grey70
            )
        }
        Box(
            modifier = Modifier
                .size(40.dp, 40.dp)
                .border(width = 1.dp, color = LightGrey40, shape = RoundedCornerShape(12.dp))
        ) {
            BasicTextField(
                value = counterState.toString(),
                onValueChange = { counterState = if (it.isEmpty()) 0 else it.toInt() },
                textStyle = MaterialTheme.typography.h6.copy(textAlign = TextAlign.Center),
                modifier = Modifier
                    .padding(8.dp),

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
        }
        IconButton(onClick = { counterState++ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_add_item),
                contentDescription = "",
                tint = Green100
            )
        }
    }
}

@Preview(name = "CounterFieldPreview", showBackground = true)
@Composable
fun CounterFieldPreview() {
    GroceriesAppTheme {
        CounterField()
    }
}