package com.example.themovie.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.themovie.core.domain.usecase.MovieUseCase

class MovieViewModel(movieUseCase: MovieUseCase) : ViewModel() {
    val movie = movieUseCase.getAllMovie().asLiveData()
}