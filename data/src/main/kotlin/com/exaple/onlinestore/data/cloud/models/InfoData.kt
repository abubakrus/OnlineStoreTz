package com.exaple.onlinestore.data.cloud.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class InfoData(
    @SerializedName("title")
    val title: String,
    @SerializedName("value")
    val value: String
) : Parcelable