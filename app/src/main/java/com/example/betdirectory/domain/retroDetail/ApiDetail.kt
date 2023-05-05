package com.example.betdirectory.domain.retroDetail

import com.example.betdirectory.model.TypesOfBets
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiDetail {

    @GET("3/typesofbets.json")
    fun getTypes() : Call<TypesOfBets>

    companion object {

        var BASE_URL = "http://167.235.200.159/"

        fun create() : ApiDetail {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiDetail::class.java)

        }
    }
}