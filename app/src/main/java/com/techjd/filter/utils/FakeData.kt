package com.techjd.filter.utils

import com.techjd.filter.models.AvailableCategory
import com.techjd.filter.models.SubCategory

object FakeData {

  fun getData(): List<AvailableCategory> {
    val categories = mutableListOf<AvailableCategory>()
    categories.add(
      AvailableCategory(
        "Price", listOf(
        SubCategory("Rs. 10000 and Below"), SubCategory("Rs. 10000 - Rs. 15000"),
        SubCategory("Rs. 15000 - Rs. 20000"), SubCategory("Rs. 20000 - Rs. 30000")
      )
      )
    )
    categories.add(
      AvailableCategory(
        "Brand", listOf(
        SubCategory("Samsung"), SubCategory("Oppo"), SubCategory("RealMe"), SubCategory("Apple"),
        SubCategory("Poco"), SubCategory("Google"), SubCategory("Mi"), SubCategory("Infinix")
      )
      )
    )
    categories.add(
      AvailableCategory(
        "Customer Ratings", listOf(SubCategory("4 and above"), SubCategory("3 and above"))
      )
    )
    categories.add(
      AvailableCategory(
        "RAM", listOf(
        SubCategory("4GB"), SubCategory("3GB"), SubCategory("2GB"), SubCategory("1GB and Below")
      )
      )
    )
    return categories
  }
}