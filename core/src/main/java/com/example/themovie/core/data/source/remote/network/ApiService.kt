package com.example.themovie.core.data.source.remote.network

import com.example.themovie.core.BuildConfig.API_KEY
import com.example.themovie.core.data.source.remote.response.ListMovieResponse
import retrofit2.http.GET

interface ApiService {

    @GET("movie/popular?api_key=$API_KEY")
    suspend fun getList(): ListMovieResponse
}