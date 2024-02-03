package com.example.onlinestore.presentation.mappers

import com.example.onlinestore.presentation.models.Feedback
import com.example.onlinestore.presentation.models.Info
import com.example.onlinestore.presentation.models.Price
import com.example.onlinestore.presentation.models.Product
import com.exaple.onlinestore.domain.models.FeedbackDomain
import com.exaple.onlinestore.domain.models.InfoDomain
import com.exaple.onlinestore.domain.models.PriceDomain
import com.exaple.onlinestore.domain.models.ProductDomain


fun InfoDomain.toInfo(): Info = this.run {
    Info(
        title = title,
        value = value
    )
}

fun PriceDomain.toPrice(): Price = this.run {
    Price(
        discount = discount,
        price = price,
        priceWithDiscount = priceWithDiscount,
        unit = unit
    )
}

fun FeedbackDomain.toFeedBack(): Feedback = this.run {
    Feedback(
        count = count,
        rating = rating
    )
}

fun ProductDomain.toProduct(): Product = this.run {
    Product(
        available = available,
        description = description,
        feedback = feedback.toFeedBack(),
        id = id,
        info = info.map { it.toInfo() },
        ingredients = ingredients,
        price = price.toPrice(),
        subtitle = subtitle,
        tags = tags,
        title = title
    )
}