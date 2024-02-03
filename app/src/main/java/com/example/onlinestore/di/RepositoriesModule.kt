package com.example.onlinestore.di

import com.exaple.onlinestore.data.repositories.ProductRepositoriesImpl
import com.exaple.onlinestore.domain.repositories.ProductRepositories
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Provides
    fun provideProductRepositories(
        implementation: ProductRepositoriesImpl
    ): ProductRepositories

}