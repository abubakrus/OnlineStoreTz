package com.example.onlinestore.presentation.app

import androidx.lifecycle.ViewModel
import com.example.onlinestore.presentation.manager.NavigatorManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val navigatorManager: NavigatorManager
) : ViewModel() {
    val destinationFlow = navigatorManager.destinationFlow()
}