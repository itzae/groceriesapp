package com.itgonca.groceriesapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.navigationBarsPadding
import com.itgonca.groceriesapp.R
import com.itgonca.groceriesapp.ui.base.InputStateHolder
import com.itgonca.groceriesapp.ui.base.rememberInputState
import com.itgonca.groceriesapp.ui.theme.*

@Composable
fun LoginScreen(phoneNumberText: InputStateHolder = rememberInputState(hint = "Phone number")) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightGrey20)
            .navigationBarsPadding(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.banner_login),
            contentDescription = "Banner Login",
            modifier = Modifier.align(Alignment.TopCenter)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(CenterVertically)
                .align(Alignment.BottomCenter)
        ) {
            Text(
                text = "Get you groceries \nwith nectar",
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(start = 16.dp)
            )
            TextField(
                value = phoneNumberText.text,
                onValueChange = { phoneNumberText.text = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp, start = 16.dp, end = 16.dp)
                    .onFocusChanged { focusState ->
                        when {
                            focusState.isFocused -> phoneNumberText.text = ""
                            else -> phoneNumberText.text = "Phone number"
                        }
                    },
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.Transparent),
                textStyle = MaterialTheme.typography.caption.copy(if (phoneNumberText.isHint) Color.LightGray else Color.Black)
            )
            Text(
                text = "Or connect with social media",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.subtitle2.copy(color = Grey70)
            )
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 16.dp, end = 16.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Blue90,
                    contentColor = Color.White
                ),
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = "icon google",
                    modifier = Modifier.weight(0.5f)
                )
                Text(
                    text = "Continue with Google",
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 16.dp, start = 24.dp)
                        .weight(2f),
                )
            }
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 16.dp, end = 16.dp, bottom = 32.dp),
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Blue100,
                    contentColor = Color.White
                )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_facebook),
                    contentDescription = "icon facebook",
                    modifier = Modifier.weight(0.5f)
                )
                Text(
                    text = "Continue with Facebook",
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 16.dp, start = 24.dp)
                        .weight(2f)
                )
            }
        }
    }
}

@Preview(name = "LoginScreenPixel3APreview", device = Devices.PIXEL_3A)
@Preview(name = "LoginScreenPreview", showBackground = true)
@Composable
fun LoginScreenPreview() {
    GroceriesAppTheme {
        LoginScreen()
    }
}