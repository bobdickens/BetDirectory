package com.example.betdirectory.domain.retroDetail

import com.example.betdirectory.model.strategy.Strategy
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface retroStrategy {
    @GET("3/strategy.json")
    fun getTypes() : Call<Strategy>

    companion object {

        var BASE_URL = "http://167.235.200.159/"

        fun create() : retroStrategy {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(retroStrategy::class.java)

        }
    }
}