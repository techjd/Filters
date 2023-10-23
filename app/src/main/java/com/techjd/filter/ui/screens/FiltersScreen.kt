package com.techjd.filter.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.techjd.filter.MainViewModel
import com.techjd.filter.ui.screens.components.CategoryList
import com.techjd.filter.ui.screens.components.FiltersBottomSection
import com.techjd.filter.ui.screens.components.SubCategoriesList

@Composable
fun FilterScreen(mainViewModel: MainViewModel = viewModel()) {
  val categories = mainViewModel.categories.value
  val selectedCategory = mainViewModel.categories.value[mainViewModel.selectedCategory.value]

  Box(modifier = Modifier.fillMaxSize()) {
    Row {
      CategoryList(
        categories = categories,
        currentSelectedCategory = mainViewModel.selectedCategory.value,
        onCategoryClick = { mainViewModel.updateSelectedCategory(it) }
      )

      SubCategoriesList(
        selectedCategory = selectedCategory,
        onSubCategoryClick = { mainViewModel.updateClickedCategory(it) })
    }

    FiltersBottomSection(
      modifier = Modifier.align(Alignment.BottomCenter),
      onClearSelections = {
        mainViewModel.resetToDefault()
      })
  }
}