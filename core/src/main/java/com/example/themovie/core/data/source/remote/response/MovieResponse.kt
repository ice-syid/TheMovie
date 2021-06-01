package com.example.themovie.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieResponse(

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("original_title")
    val original_title: String,

    @field:SerializedName("release_date")
    val release_date: String,

    @field:SerializedName("vote_average")
    val vote_average: Double,

    @field:SerializedName("overview")
    val overview: String,

    @field:SerializedName("poster_path")
    val poster_path: String
)