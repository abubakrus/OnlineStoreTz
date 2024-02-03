package com.example.onlinestore.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.onlinestore.presentation.theme.Grey
import com.example.onlinestore.presentation.theme.LargeSpacing
import com.example.onlinestore.presentation.theme.MediumSpacing
import com.google.i18n.phonenumbers.PhoneNumberUtil


@Composable
fun LoginOutlinedText(
    value: String,
    hint: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    fieldModifier: Modifier = Modifier,
    isSingleLine: Boolean = true
) {
    var isValid by remember { mutableStateOf(true) }

    OutlinedTextField(
        value = value,
        onValueChange = {
            onValueChange
            isValid = isNameValid(it)
        },
        singleLine = isSingleLine,
        colors = TextFieldDefaults.colors(
            disabledContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Grey.copy(alpha = 0.5f),

            disabledIndicatorColor = Grey,
            focusedIndicatorColor = Grey,
            unfocusedIndicatorColor = Color.Transparent,
        ),
        modifier = fieldModifier
            .clip(RoundedCornerShape(8.dp))
            .fillMaxWidth(),

        textStyle = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.Bold
        ),
        placeholder = {
            Text(
                text = hint,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold,
                color = Grey
            )
        },
        trailingIcon = {
            if (value.isNotEmpty()) Icon(
                modifier = Modifier
                    .size(24.dp)
                    .clickable { onValueChange(String()) },
                imageVector = Icons.Default.Clear,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onBackground
            )
        },
        shape = RoundedCornerShape(8.dp)
    )

}

@Composable
fun PhoneNumberOutlinedText(
    value: String,
    hint: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    fieldModifier: Modifier = Modifier,
    isSingleLine: Boolean = true
) {
    var isValid by remember { mutableStateOf(true) }

    val phoneNumberUtil = PhoneNumberUtil.getInstance()

    OutlinedTextField(
        value = value,
        onValueChange = {
            onValueChange
            isValid = isPhoneNumberValid(it,phoneNumberUtil)
        },
        singleLine = isSingleLine,
        colors = TextFieldDefaults.colors(
            disabledContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Grey.copy(alpha = 0.5f),

            disabledIndicatorColor = Grey,
            focusedIndicatorColor = Grey,
            unfocusedIndicatorColor = Color.Transparent,
        ),
        modifier = fieldModifier
            .clip(RoundedCornerShape(8.dp))
            .fillMaxWidth(),

        textStyle = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.Bold
        ),
        placeholder = {
            Text(
                text = hint,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold,
                color = Grey
            )
        },
        trailingIcon = {
            if (value.isNotEmpty()) Icon(
                modifier = Modifier
                    .size(24.dp)
                    .clickable { onValueChange(String()) },
                imageVector = Icons.Default.Clear,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onBackground
            )
        },
        shape = RoundedCornerShape(8.dp)
    )

}


@Composable
fun EditTextField(
    value: String,
    hint: String,
    topText: String? = null,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    fieldModifier: Modifier = Modifier,
    isSingleLine: Boolean = true
) {
    Column(
        modifier = modifier
    ) {
        if (topText != null) Text(
            modifier = fieldModifier,
            text = topText.uppercase(),
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold,
            color = Grey
        )
        Spacer(modifier = Modifier.width(MediumSpacing))
        TextField(
            value = value,
            onValueChange = onValueChange,
            singleLine = isSingleLine,
            modifier = fieldModifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp)),
            colors = TextFieldDefaults.colors(
                disabledContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,

                disabledIndicatorColor = Grey,
                focusedIndicatorColor = Grey,
                unfocusedIndicatorColor = Grey,
            ),
            textStyle = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Bold
            ),
            placeholder = {
                Text(
                    text = hint,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.SemiBold,
                    color = Grey
                )
            },
            trailingIcon = {
                if (value.isNotEmpty()) Icon(
                    modifier = Modifier
                        .size(24.dp)
                        .clickable { onValueChange(String()) },
                    imageVector = Icons.Default.Clear,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onBackground
                )
            }
        )
    }
}


@Preview
@Composable
fun EditTextFieldPreview() {
    MaterialTheme {
        LoginOutlinedText(
            value = "",
            onValueChange = {},
            modifier = Modifier.background(Grey),
            hint = "asnocnokacs",
            fieldModifier = Modifier.padding(horizontal = LargeSpacing)
        )
    }
}

