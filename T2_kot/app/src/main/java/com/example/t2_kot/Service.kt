package com.example.t2_kot

import retrofit2.Call
import retrofit2.http.GET

interface Service {

    @GET("?t=Harry+Potter&apikey=592f91bf")
    fun list(): Call<List<Note>>

}