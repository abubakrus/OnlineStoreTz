package com.example.onlinestore.presentation.components

import com.google.i18n.phonenumbers.NumberParseException
import com.google.i18n.phonenumbers.PhoneNumberUtil

fun isNameValid(input: String): Boolean {
    val regex = Regex("[а-яА-ЯёЁ]+") // Регулярное выражение для проверки кириллицы
    return regex.matches(input)
}

fun isPhoneNumberValid(input: String, phoneNumberUtil: PhoneNumberUtil): Boolean {
    return try {
        val phoneNumber = phoneNumberUtil.parse(input, "RU") // Предполагаем, что номер телефона в России
        phoneNumberUtil.isValidNumber(phoneNumber)
    } catch (e: NumberParseException) {
        false
    }
}