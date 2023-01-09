package ru.oktemsec.springkotlindevmark.repository

import org.springframework.data.repository.CrudRepository
import ru.oktemsec.springkotlindevmark.entity.CountryEntity

interface CountryRepository: CrudRepository<CountryEntity, Int> {
    fun findByOrderByName(): List<CountryEntity>

    fun findByNameStartsWithOrderByName(start: String): List<CountryEntity>
}