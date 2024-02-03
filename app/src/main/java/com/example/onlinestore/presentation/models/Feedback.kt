package com.example.onlinestore.presentation.models


data class Feedback(
    val count: Int,
    val rating: Double
) {
    fun isUnknown() = this == unknown

    fun isNotUnknown() = this != unknown

    companion object {
        val unknown = Feedback(
            count = 0,
            rating = 0.0
        )
    }
}