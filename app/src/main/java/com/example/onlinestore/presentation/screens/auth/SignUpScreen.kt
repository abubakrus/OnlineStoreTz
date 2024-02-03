package com.example.onlinestore.presentation.screens.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.onlinestore.R
import com.example.onlinestore.presentation.components.LoginOutlinedText
import com.example.onlinestore.presentation.components.TabBar
import com.example.onlinestore.presentation.theme.ExtraMediumSpacing
import com.example.onlinestore.presentation.theme.Grey
import com.example.onlinestore.presentation.theme.LargeSpacing
import com.example.onlinestore.presentation.theme.MediumSpacing
import com.example.onlinestore.presentation.theme.Pink
import com.example.onlinestore.presentation.theme.White

@Composable
fun SignUpScreen(
    uiState: SignUpUiState,
    onClickToMain: () -> Unit,
    onEvent: (SignUpEvent) -> Unit,
    modifier: Modifier = Modifier,

    ) {
    Scaffold(
        topBar = {
            TabBar(
                title = stringResource(id = R.string.auth),
            )
        }
    ) { innerPaddings ->
        if (uiState.isAuthentication) {
            SignUpScreenMainContent(
                uiState = uiState,
                onClickToMain = onClickToMain,
                modifier = modifier.padding(innerPaddings),
                onEvent = onEvent
            )
        }
    }
}


@Composable
fun SignUpScreenMainContent(
    uiState: SignUpUiState,
    onClickToMain: () -> Unit,
    onEvent: (SignUpEvent) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(120.dp))
        LoginOutlinedText(
            value = uiState.name,
            hint = stringResource(id = R.string.your_name),
            onValueChange = {
                onEvent(SignUpEvent.OnNameChanged(it))
            },
            fieldModifier = Modifier.padding(horizontal = ExtraMediumSpacing)
        )
        Spacer(modifier = Modifier.height(MediumSpacing))
        LoginOutlinedText(
            value = uiState.lastName,
            hint = stringResource(id = R.string.your_last_name),
            onValueChange = {
                onEvent(SignUpEvent.OnLastNameChanged(it))
            },
            fieldModifier = Modifier.padding(horizontal = ExtraMediumSpacing)

        )
        Spacer(modifier = Modifier.height(MediumSpacing))
        LoginOutlinedText(
            value = uiState.number,
            hint = stringResource(id = R.string.your_number_phone),
            onValueChange = {
                onEvent(SignUpEvent.OnPhoneNumberChanged(it))
            },
            fieldModifier = Modifier.padding(horizontal = ExtraMediumSpacing)
        )
        Spacer(modifier = Modifier.height(LargeSpacing))
        Button(
            onClick = {onClickToMain()},
            colors = ButtonDefaults.buttonColors(
                containerColor = Pink
            ),
            modifier = Modifier
                .height(52.dp)
                .fillMaxWidth()
                .padding(horizontal = ExtraMediumSpacing),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = stringResource(id = R.string.comein),
                style = MaterialTheme.typography.bodyLarge.copy(
                    color = White
                )
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = stringResource(id = R.string.onclick_button),
            style = MaterialTheme.typography.bodyMedium.copy(
                color = Grey
            )
        )
        Text(
            text = stringResource(id = R.string.conditions_programmer),
            style = MaterialTheme.typography.bodyMedium.copy(
                color = Grey
            )
        )
    }
}




