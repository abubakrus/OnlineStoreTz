package com.exaple.onlinestore.domain.usecase

import com.exaple.onlinestore.domain.models.ProductDomain

interface FetchAllProductUseCase {

    suspend operator fun invoke(): List<ProductDomain>

}