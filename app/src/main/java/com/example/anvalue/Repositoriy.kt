package com.example.anvalue

import retrofit2.Response

class Repositoriy {
    suspend fun getprivat(): Response<privatbank> {
        return RetrofitInstance.api.getNalMoneys()
    }
}