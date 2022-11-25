package com.example.movies.domain.model

import com.example.movies.data.source.remote.dto.Location
import com.example.movies.data.source.remote.dto.Origin

data class Character(
    val id: Int,
    val name: String,
    val status: String,
    val gender: String,
    val origin: Origin,
    val location: Location,
    val image: String,
    val species: String
)
