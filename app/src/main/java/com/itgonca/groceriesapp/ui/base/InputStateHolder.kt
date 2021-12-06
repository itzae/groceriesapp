package com.itgonca.groceriesapp.ui.base

import androidx.compose.runtime.*

class InputStateHolder(private val hint: String, initiallText: String) {
    var text by mutableStateOf(initiallText)
    val isHint: Boolean
        get() = text == hint
}

@Composable
fun rememberInputState(hint: String): InputStateHolder =
    remember(hint) {
        InputStateHolder(hint, hint)
    }