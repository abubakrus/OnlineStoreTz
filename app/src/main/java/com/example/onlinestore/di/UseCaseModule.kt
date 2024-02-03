package com.example.onlinestore.di

import com.exaple.onlinestore.domain.repositories.ProductRepositories
import com.exaple.onlinestore.domain.usecase.FetchAllProductUseCase
import com.exaple.onlinestore.domain.usecase.FetchAllProductUseCaseImpl
import com.exaple.onlinestore.domain.usecase.FetchByIdProductUseCase
import com.exaple.onlinestore.domain.usecase.FetchByIdProductUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    fun provideFetchAllProductUseCase(
        repositories: ProductRepositories
    ): FetchAllProductUseCase = FetchAllProductUseCaseImpl(
        repositories = repositories
    )

    @Provides
    fun provideFetchByIdProductUseCase(
        repositories: ProductRepositories
    ): FetchByIdProductUseCase = FetchByIdProductUseCaseImpl(
        repositories = repositories
    )
}