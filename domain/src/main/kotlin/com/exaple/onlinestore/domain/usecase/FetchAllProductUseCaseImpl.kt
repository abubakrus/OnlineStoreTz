package com.exaple.onlinestore.domain.usecase

import com.exaple.onlinestore.domain.models.ProductDomain
import com.exaple.onlinestore.domain.repositories.ProductRepositories

class FetchAllProductUseCaseImpl constructor(
    private val repositories: ProductRepositories
) : FetchAllProductUseCase {
    override suspend fun invoke(): List<ProductDomain> {
        return repositories.fetchAllProduct()
    }
}