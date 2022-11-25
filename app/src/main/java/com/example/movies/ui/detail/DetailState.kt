package com.example.movies.ui.detail

import com.example.movies.domain.model.Character

data class DetailState(
    val character: Character? = null,
    val isLoading: Boolean = false
)