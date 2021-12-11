package com.itgonca.groceriesapp.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.itgonca.groceriesapp.R
import com.itgonca.groceriesapp.ui.components.CounterField
import com.itgonca.groceriesapp.ui.theme.Green100
import com.itgonca.groceriesapp.ui.theme.Grey60
import com.itgonca.groceriesapp.ui.theme.GroceriesAppTheme
import com.itgonca.groceriesapp.ui.theme.LightGrey10

@ExperimentalAnimationApi
@Composable
fun ProductDetailScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(8f)
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .clip(RoundedCornerShape(bottomStart = 25.dp, bottomEnd = 25.dp))
                        .background(LightGrey10),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.apple),
                        contentDescription = "Image product"
                    )
                }
            }
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f)
                        .padding(start = 16.dp, end = 16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Natural Red Apple", style = MaterialTheme.typography.h5)
                        IconButton(onClick = {}) {
                            Icon(
                                imageVector = Icons.Outlined.Favorite,
                                contentDescription = "Favorite icon"
                            )
                        }
                    }
                    Text(
                        text = "1kg. price",
                        style = MaterialTheme.typography.subtitle1.copy(color = Grey60)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CounterField()
                        Text(text = "$4.99", style = MaterialTheme.typography.h5)
                    }
                }

            }
            items(3) {
                SectionExpandable(
                    modifier = Modifier.padding(
                        top = 24.dp,
                        start = 16.dp,
                        end = 16.dp
                    ), sectionName ="Product detail"
                )
            }
        }
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(backgroundColor = Green100),
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(16.dp)
        ) {
            Text(text = "Add to cart")
        }
    }
}

@ExperimentalAnimationApi
@Composable
fun SectionExpandable(modifier: Modifier = Modifier, sectionName: String) {
    var isExpanded by remember {
        mutableStateOf(false)
    }
    val arrowRotate by animateFloatAsState(
        targetValue = if (isExpanded) 0f else -90f,
        animationSpec = tween(250)
    )


    Column(modifier = modifier.fillMaxWidth()) {
        Divider()
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { isExpanded = !isExpanded },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = sectionName, style = MaterialTheme.typography.subtitle1)
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_down_arrow),
                    contentDescription = "Arrow down",
                    modifier = Modifier.rotate(arrowRotate)
                )
            }
        }
        AnimatedVisibility(
            visible = isExpanded
        ) {
            Text(
                text = "Apples are nutritious. Apples may be good for weight loss. apples may be good for your heart. As part of a healtful and varied diet.",
                style = MaterialTheme.typography.body1.copy(color = Grey60, lineHeight = 23.sp)
            )
        }
    }
}

@ExperimentalAnimationApi
@Preview(name = "ProductDetailScreenPreview", showBackground = true)
@Composable
fun ProductDetailScreenPreview() {
    GroceriesAppTheme {
        ProductDetailScreen()
    }
}

@ExperimentalAnimationApi
@Preview(name = "SectionExpandablePreview", showBackground = true)
@Composable
fun SectionExpandablePreview() {
    GroceriesAppTheme {
        SectionExpandable(sectionName = "Product detail")
    }
}