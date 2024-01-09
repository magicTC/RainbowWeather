package com.example.rainbowweather.logic.network

import retrofit2.Retrofit
import retrofit2.Converter.Factory
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.converter.gson.GsonConverterFactory


object ServiceCreator {
    private const val BASE_URL = "https://api.caiyunapp.com/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun <T> creat(serviceClass: Class<T>) : T = retrofit.create(serviceClass)
    inline fun <reified T> creat(): T = creat(T::class.java)
}