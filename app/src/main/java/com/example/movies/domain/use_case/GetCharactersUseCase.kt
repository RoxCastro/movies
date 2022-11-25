package com.example.movies.domain.use_case

import com.example.movies.data.Result
import com.example.movies.domain.model.Characters
import com.example.movies.domain.repositories.CharacterRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase  @Inject constructor(
    private val repository: CharacterRepository
){
    operator fun invoke(page: Int): Flow<Result<List<Characters>>> {
        return repository.getCharacters(page)
    }
}