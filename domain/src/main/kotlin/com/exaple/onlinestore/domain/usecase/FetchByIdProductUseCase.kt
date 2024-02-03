package com.exaple.onlinestore.domain.usecase

import com.exaple.onlinestore.domain.models.ProductDomain

interface FetchByIdProductUseCase {
    suspend fun fetchByIdProduct(id: String): ProductDomain
}