package com.example.themovie.di

import com.example.themovie.core.domain.usecase.MovieInteractor
import com.example.themovie.core.domain.usecase.MovieUseCase
import com.example.themovie.detail.DetailMovieViewModel
import com.example.themovie.movie.MovieViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { MovieViewModel(get()) }
    viewModel { DetailMovieViewModel(get()) }
}