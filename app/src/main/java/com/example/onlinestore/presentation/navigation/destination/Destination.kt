package com.example.onlinestore.presentation.navigation.destination

interface Destination {

    fun route(): String

    fun routeWithArgs(): String

}