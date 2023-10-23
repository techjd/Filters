package com.techjd.filter.ui.screens.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.techjd.filter.TAG
import com.techjd.filter.ui.theme.LightGrey

@Composable
fun CategoryText(
  category: String,
  isSelected: Boolean,
  onClick: () -> Unit
) {
  Log.d(TAG, "CategoryText: ")

  Box(
    modifier = Modifier
      .fillMaxWidth()
      .heightIn(64.dp)
      .clickable(enabled = true, onClick = onClick)
      .background(if (isSelected) Color.White else LightGrey)
  ) {
    Text(
      text = category, modifier = Modifier
      .padding(start = 4.dp)
      .align(Alignment.CenterStart),
      color = if (isSelected) Color.Blue else Color.Black
    )
  }
}