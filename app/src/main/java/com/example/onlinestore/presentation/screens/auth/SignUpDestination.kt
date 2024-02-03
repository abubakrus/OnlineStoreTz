package com.example.onlinestore.presentation.screens.auth

import com.example.onlinestore.presentation.navigation.destination.Destination

object SignUpDestination : Destination {
    override fun route(): String = "signup_screen_route"

    override fun routeWithArgs(): String = route()
}