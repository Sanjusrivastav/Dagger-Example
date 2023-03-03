package com.example.dagger.UserRepo

import com.example.dagger.SQlRepository
import com.example.dagger.UserRepository
import dagger.Binds
import dagger.Module

@Module
 abstract class UserRepositoryModule {

    @Binds
    abstract fun getSQlRepository(sQlRepository: SQlRepository): UserRepository

}