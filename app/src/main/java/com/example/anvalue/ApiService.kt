package com.example.anvalue

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneys(): Response<privatbank>
}