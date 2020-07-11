package com.example.learnhilt.data.api

import com.example.learnhilt.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}