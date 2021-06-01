package com.example.themovie.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val id: Int,
    val original_title: String,
    val release_date: String,
    val vote_average: Double,
    val overview: String,
    val poster_path: String,
    var isFavorite: Boolean
) : Parcelable