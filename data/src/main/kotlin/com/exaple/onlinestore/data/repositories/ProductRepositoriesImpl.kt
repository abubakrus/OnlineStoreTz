package com.exaple.onlinestore.data.repositories

import com.exaple.onlinestore.data.cloud.mappers.toDomain
import com.exaple.onlinestore.data.cloud.service.ProductService
import com.exaple.onlinestore.domain.models.ProductDomain
import com.exaple.onlinestore.domain.repositories.ProductRepositories
import javax.inject.Inject

class ProductRepositoriesImpl @Inject constructor(
    private val service: ProductService
) : ProductRepositories {

    override suspend fun fetchAllProduct(): List<ProductDomain> {
        return service.fetchAllProduct().items.map { it.toDomain() }
    }

    override suspend fun fetchByIdProduct(id: String): ProductDomain {
        return service.fetchFaunaById(id).toDomain()
    }

}