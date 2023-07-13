package com.example.uasandri.service

import com.example.uasandri.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=d05a3dbf31a2128b7bc15971e5a43d40")
    fun getTVList(): Call<TVResponse>
}