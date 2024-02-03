package com.example.onlinestore.di

import com.example.onlinestore.presentation.manager.NavigatorManager
import com.example.onlinestore.presentation.manager.NavigatorManagerImpl
import com.example.onlinestore.presentation.manager.toast.ShowToastUseCase
import com.example.onlinestore.presentation.manager.toast.ToastManager
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface ManagerModule {
    @Binds
    @Singleton
    fun bindNavigatorManager(
        implementation: NavigatorManagerImpl
    ): NavigatorManager


    @Binds
    @Singleton
    fun bindToastManager(
        implementation: ToastManager
    ): ShowToastUseCase
}