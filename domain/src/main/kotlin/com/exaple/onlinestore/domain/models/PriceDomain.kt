package com.exaple.onlinestore.domain.models


data class PriceDomain(
    val discount: Int,
    val price: String,
    val priceWithDiscount: String,
    val unit: String
)