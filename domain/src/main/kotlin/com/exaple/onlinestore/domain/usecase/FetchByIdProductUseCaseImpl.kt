package com.exaple.onlinestore.domain.usecase

import com.exaple.onlinestore.domain.models.ProductDomain
import com.exaple.onlinestore.domain.repositories.ProductRepositories

class FetchByIdProductUseCaseImpl constructor(
    private val repositories: ProductRepositories
) : FetchByIdProductUseCase {
    override suspend fun fetchByIdProduct(id: String): ProductDomain {
        return repositories.fetchByIdProduct(id)
    }
}