package com.techjd.filter.ui.screens.components

import android.util.Log
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.techjd.filter.TAG
import com.techjd.filter.models.AvailableCategory

@Composable
fun SubCategoriesList(
  selectedCategory: AvailableCategory,
  onSubCategoryClick: (Int) -> Unit
) {
  Log.d(TAG, "SubCategoriesList: ")

  LazyColumn(modifier = Modifier.fillMaxHeight()) {
    items(selectedCategory.subCategories.size) { index ->
      SubCategoryText(
        selectedCategory = selectedCategory.subCategories[index].subCategoryName,
        isSelected = selectedCategory.subCategories[index].isSelected,
        onCheckBoxClicked = {
          onSubCategoryClick(index)
        }
      )
    }
  }
}