package com.example.onlinestore.presentation.screens.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.onlinestore.presentation.extensions.createMutableSharedFlowAsSingleLiveEvent
import com.example.onlinestore.presentation.extensions.firstLetterIsCapitalizedRestSmall
import com.example.onlinestore.presentation.navigation.app_nav_graph.MAIN_NAV_GRAPH_ROUTE
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
) : ViewModel() {
    private val _uiState = MutableStateFlow(SignUpUiState())
    val uiState: StateFlow<SignUpUiState> = _uiState.asStateFlow()

    private val _navCommandFlow = createMutableSharedFlowAsSingleLiveEvent<String>()
    val navCommandFlow: SharedFlow<String> = _navCommandFlow.asSharedFlow()


    fun onEvent(event: SignUpEvent) {
        when (event) {
            is SignUpEvent.OnNameChanged -> doNamedChanged(event.value)
            is SignUpEvent.OnLastNameChanged -> doLastNamedChanged(event.value)
            is SignUpEvent.OnPhoneNumberChanged -> doPhoneNumberChanged(event.value)
            is SignUpEvent.OnSignUpClick -> doSignUpClick()
        }
    }

    private fun doSignUpClick() {
        _navCommandFlow.tryEmit(MAIN_NAV_GRAPH_ROUTE)
    }


    private fun doNamedChanged(event: String) {
        _uiState.update { uiState ->
            uiState.copy(name = event.firstLetterIsCapitalizedRestSmall())
        }
    }

    private fun doLastNamedChanged(event: String) {
        _uiState.update { uiState ->
            uiState.copy(lastName = event.firstLetterIsCapitalizedRestSmall())
        }
    }

    private fun doPhoneNumberChanged(event: String) {
        _uiState.update { uiState ->
            uiState.copy(number = event.firstLetterIsCapitalizedRestSmall())
        }
    }
}

