package com.exaple.onlinestore.domain.models


data class  ProductDomain(
    val available: Int,
    val description: String,
    val feedback: FeedbackDomain,
    val id: String,
    val info: List<InfoDomain>,
    val ingredients: String,
    val price: PriceDomain,
    val subtitle: String,
    val tags: List<String>,
    val title: String
)