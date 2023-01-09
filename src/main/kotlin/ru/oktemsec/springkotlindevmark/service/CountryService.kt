package ru.oktemsec.springkotlindevmark.service

import ru.oktemsec.springkotlindevmark.dto.CountryDto

interface CountryService {
    fun getAll(pageIndex: Int): List<CountryDto>

    fun search(prefix: String): List<CountryDto>

    fun getById(id: Int): CountryDto
}