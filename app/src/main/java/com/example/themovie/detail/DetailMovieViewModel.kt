package com.example.themovie.detail

import androidx.lifecycle.ViewModel
import com.example.themovie.core.domain.model.Movie
import com.example.themovie.core.domain.usecase.MovieUseCase

class DetailMovieViewModel(private val movieUseCase: MovieUseCase) : ViewModel() {
    fun setFavoriteMovie(movie: Movie, newStatus: Boolean) =
        movieUseCase.setFavoriteMovie(movie, newStatus)
}