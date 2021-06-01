package com.example.themovie.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.themovie.core.domain.usecase.MovieUseCase

class FavoriteViewModel(movieViewModel: MovieUseCase) : ViewModel() {
    val favoriteMovie = movieViewModel.getFavoriteMovie().asLiveData()
}