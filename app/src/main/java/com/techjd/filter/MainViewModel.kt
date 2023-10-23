package com.techjd.filter

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.techjd.filter.models.AvailableCategory
import com.techjd.filter.utils.FakeData

class MainViewModel : ViewModel() {

  val categories = mutableStateOf(listOf<AvailableCategory>())
  val selectedCategory = mutableStateOf(0)

  init {
    getData()
  }

  private fun getData() {
    categories.value = emptyList()
    categories.value = FakeData.getData()
  }

  fun updateSelectedCategory(idx: Int) {
    selectedCategory.value = idx
  }

  fun updateClickedCategory(subCategoryIdx: Int) {
    val cat = categories.value.toMutableList()
    val subCat = cat[selectedCategory.value].subCategories.toMutableList()
    subCat[subCategoryIdx] =
      subCat[subCategoryIdx].copy(isSelected = !subCat[subCategoryIdx].isSelected)
    cat[selectedCategory.value] = cat[selectedCategory.value].copy(subCategories = subCat)
    categories.value = emptyList()
    categories.value = cat
  }

  fun resetToDefault() {
    getData()
  }
}