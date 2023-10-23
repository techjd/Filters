package com.techjd.filter.ui.screens.components

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.techjd.filter.TAG

@Composable
fun FiltersBottomSection(
  modifier: Modifier = Modifier,
  onClearSelections : () -> Unit
) {
  Log.d(TAG, "FiltersBottomSection: ")

  Row(
    modifier = modifier
      .fillMaxWidth()
      .padding(8.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceEvenly
  ) {
    Button(
      modifier = Modifier
        .fillMaxWidth()
        .weight(1f),
      shape = RoundedCornerShape(8.dp),
      onClick = onClearSelections
    ) {
      Text(text = "Clear Selections")
    }

    Spacer(modifier = Modifier.width(8.dp))

    Button(
      modifier = Modifier
        .fillMaxWidth()
        .weight(1f),
      shape = RoundedCornerShape(8.dp),
      onClick = { /*TODO*/ }) {
      Text(text = "Apply Filters")
    }
  }
}