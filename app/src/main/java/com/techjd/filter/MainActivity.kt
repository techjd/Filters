package com.techjd.filter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.techjd.filter.ui.screens.FilterScreen
import com.techjd.filter.ui.theme.FilterTheme

const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      FilterTheme {
        FilterScreen()
      }
    }
  }
}