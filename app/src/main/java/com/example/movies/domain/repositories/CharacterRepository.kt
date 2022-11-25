package com.example.movies.domain.repositories

import com.example.movies.data.Result
import com.example.movies.domain.model.Character
import com.example.movies.domain.model.Characters
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {
    fun getCharacters(page:Int): Flow<Result<List<Characters>>>

    suspend fun getCharacter(id: Int): Result<Character>
}