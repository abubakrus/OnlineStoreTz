package com.example.onlinestore.presentation.models


data class Price(
    val discount: Int,
    val price: String,
    val priceWithDiscount: String,
    val unit: String
) {
    fun isUnknown() = this == unknown

    fun isNotUnknown() = this != unknown

    companion object {
        val unknown = Price(
            discount = 0,
            price = String(),
            priceWithDiscount = String(),
            unit = String()
        )
    }
}