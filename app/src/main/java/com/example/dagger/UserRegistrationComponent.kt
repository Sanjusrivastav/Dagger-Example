package com.example.dagger

import dagger.Component


@Component
interface UserRegistrationComponent {

    fun inject (mainActivity: MainActivity) // mainActivity is a Consumer
}