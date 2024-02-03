package com.example.onlinestore.presentation.screens.auth


data class SignUpUiState(
    val name: String = String(),
    val lastName: String = String(),
    val number: String = String(),
    val isAuthentication: Boolean = true,
    val errorMessage: String? = null,
    val isSuccessesAuth: Boolean = false
)
