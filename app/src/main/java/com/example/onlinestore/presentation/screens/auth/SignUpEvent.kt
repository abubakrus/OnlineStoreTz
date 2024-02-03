package com.example.onlinestore.presentation.screens.auth


sealed class SignUpEvent {

    data class OnNameChanged(val value: String) : SignUpEvent()

    data class OnLastNameChanged(val value: String) : SignUpEvent()

    data class OnPhoneNumberChanged(val value: String) : SignUpEvent()

    data object OnSignUpClick : SignUpEvent()

}