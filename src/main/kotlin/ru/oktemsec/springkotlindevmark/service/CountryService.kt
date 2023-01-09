package ru.oktemsec.springkotlindevmark.service

import ru.oktemsec.springkotlindevmark.dto.CountryDto

interface CountryService {
    fun getAll(): List<CountryDto>

    fun getByName(start: String): List<CountryDto>
}