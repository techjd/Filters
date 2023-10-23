package com.techjd.filter.models

data class AvailableCategory(
  val categoryName: String,
  val subCategories: List<SubCategory>
)

