package com.example.themovie.core.utils

import com.example.themovie.core.data.source.local.entity.MovieEntity
import com.example.themovie.core.data.source.remote.response.MovieResponse
import com.example.themovie.core.domain.model.Movie

object DataMapper {
    fun mapResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                id = it.id,
                original_title = it.original_title,
                release_date = it.release_date,
                vote_average = it.vote_average,
                overview = it.overview,
                poster_path = it.poster_path,
                isFavorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                id = it.id,
                original_title = it.original_title,
                release_date = it.release_date,
                vote_average = it.vote_average,
                overview = it.overview,
                poster_path = it.poster_path,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntity(input: Movie) =
        MovieEntity(
            id = input.id,
            original_title = input.original_title,
            release_date = input.release_date,
            vote_average = input.vote_average,
            overview = input.overview,
            poster_path = input.poster_path,
            isFavorite = input.isFavorite
        )
}