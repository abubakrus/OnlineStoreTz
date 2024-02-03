package com.exaple.onlinestore.data.cloud.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FeedbackData(
    @SerializedName("count")
    val count: Int,
    @SerializedName("rating")
    val rating: Double
) : Parcelable