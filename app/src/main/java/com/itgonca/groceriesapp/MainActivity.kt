package com.itgonca.groceriesapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.ProvideWindowInsets
import com.itgonca.groceriesapp.ui.HomeActivity
import com.itgonca.groceriesapp.ui.navigation.MainNavGraph
import com.itgonca.groceriesapp.ui.theme.GroceriesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ProvideWindowInsets {
                GroceriesAppTheme {
                    // A surface container using the 'background' color from the theme
                    Surface(color = MaterialTheme.colors.background) {
                        MainNavGraph {
                            val intentNew = Intent(this, HomeActivity::class.java)
                            startActivity(intentNew)
                            finish()
                        }
                    }

                }
            }
        }
    }
}