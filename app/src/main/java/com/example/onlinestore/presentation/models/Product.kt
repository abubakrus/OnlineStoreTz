package com.example.onlinestore.presentation.models


data class Product(
    val available: Int,
    val description: String,
    val feedback: Feedback,
    val id: String,
    val info: List<Info>,
    val ingredients: String,
    val price: Price,
    val subtitle: String,
    val tags: List<String>,
    val title: String
) {


    fun isUnknown() = this == unknown

    fun isNotUnknown() = this != unknown

    companion object {
        val unknown = Product(
            available = 0,
            description = String(),
            feedback = Feedback.unknown,
            id = String(),
            info = listOf(),
            ingredients = String(),
            price = Price.unknown,
            subtitle = String(),
            tags = listOf(),
            title = String()
        )
    }
}