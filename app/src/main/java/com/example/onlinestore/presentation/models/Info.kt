package com.example.onlinestore.presentation.models


data class Info(
    val title: String,
    val value: String
) {
    fun isUnknown() = this == unknown

    fun isNotUnknown() = this != unknown

    companion object {
        val unknown = Info(
            title = String(),
            value = String()
        )
    }
}