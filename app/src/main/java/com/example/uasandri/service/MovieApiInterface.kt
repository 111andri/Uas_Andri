package com.example.uasandri.service


import com.example.uasandri.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=540d6f428d0cff1c77ba452735dccc8a")
    fun getMovieList(): Call<MovieResponse>
}