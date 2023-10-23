package com.techjd.filter.ui.screens.components

import android.util.Log
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.techjd.filter.TAG

@Composable
fun SubCategoryText(
  selectedCategory: String,
  isSelected: Boolean,
  onCheckBoxClicked: (Boolean) -> Unit
) {
  Log.d(TAG, "SubCategoryText: ")

  Row(
    modifier = Modifier.fillMaxWidth(),
    verticalAlignment = Alignment.CenterVertically
  ) {
    Checkbox(checked = isSelected, onCheckedChange = onCheckBoxClicked)
    Spacer(modifier = Modifier.width(2.dp))
    Text(text = selectedCategory)
  }
}