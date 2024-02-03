package com.exaple.onlinestore.domain.repositories

import com.exaple.onlinestore.domain.models.ProductDomain


interface ProductRepositories {

    suspend fun fetchAllProduct(): List<ProductDomain>

    suspend fun fetchByIdProduct(id: String): ProductDomain
}