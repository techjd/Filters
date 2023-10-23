package com.techjd.filter.ui.screens.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.techjd.filter.TAG
import com.techjd.filter.models.AvailableCategory
import com.techjd.filter.ui.theme.LightGrey

@Composable
fun CategoryList(
  categories: List<AvailableCategory>,
  currentSelectedCategory: Int,
  onCategoryClick: (Int) -> Unit
) {
  Log.d(TAG, "CategoryList: ")

  LazyColumn(
    modifier = Modifier
      .fillMaxHeight()
      .fillMaxWidth(0.4f)
      .background(LightGrey)
  ) {

    items(categories.size) {
      CategoryText(
        category = categories[it].categoryName,
        isSelected = currentSelectedCategory == it,
        onClick = {
          onCategoryClick(it)
        }
      )
    }
  }
}