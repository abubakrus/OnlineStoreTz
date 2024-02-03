package com.exaple.onlinestore.data.cloud.service

import com.exaple.onlinestore.data.cloud.models.ProductData
import com.exaple.onlinestore.data.cloud.models.ProductResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface ProductService {

    @GET("Item")
    suspend fun fetchAllProduct(): ProductResponse

    @GET("Item")
    suspend fun fetchFaunaById(@Query("where") params: String): ProductData
}

