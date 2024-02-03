package com.exaple.onlinestore.data.cloud.mappers

import com.exaple.onlinestore.data.cloud.models.FeedbackData
import com.exaple.onlinestore.data.cloud.models.InfoData
import com.exaple.onlinestore.data.cloud.models.PriceData
import com.exaple.onlinestore.data.cloud.models.ProductData
import com.exaple.onlinestore.domain.models.FeedbackDomain
import com.exaple.onlinestore.domain.models.InfoDomain
import com.exaple.onlinestore.domain.models.PriceDomain
import com.exaple.onlinestore.domain.models.ProductDomain


fun InfoData.toDomain(): InfoDomain = this.run {
    InfoDomain(
        title = title,
        value = value
    )
}

fun PriceData.toDomain(): PriceDomain = this.run {
    PriceDomain(
        discount = discount,
        price = price,
        priceWithDiscount = priceWithDiscount,
        unit = unit
    )
}

fun FeedbackData.toDomain(): FeedbackDomain = this.run {
    FeedbackDomain(
        count = count,
        rating = rating
    )
}


fun ProductData.toDomain(): ProductDomain = this.run {
    ProductDomain(
        available = available,
        description = description,
        feedback = feedback.toDomain(),
        id = id,
        info = info.map { it.toDomain() },
        ingredients = ingredients,
        price = price.toDomain(),
        subtitle = subtitle,
        tags = tags,
        title = title
    )
}


