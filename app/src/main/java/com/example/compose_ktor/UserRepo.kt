package com.example.compose_ktor

import io.ktor.client.request.*
import io.ktor.utils.io.core.*

object UserRepo {

    suspend fun fetchUsers(): List<User>{
        val url = "https://615075ada706cd00179b745c.mockapi.io/users"
        return KtorClient.httpClient.use {
            it.get(url)
        }
    }
}