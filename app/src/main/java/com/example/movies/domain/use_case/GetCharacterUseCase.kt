package com.example.movies.domain.use_case

import com.example.movies.domain.model.Character
import com.example.movies.domain.repositories.CharacterRepository
import com.example.movies.data.Result
import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
    private val repository: CharacterRepository
){
    suspend operator fun invoke(id: Int): Result<Character>{
        return repository.getCharacter(id)
    }
}