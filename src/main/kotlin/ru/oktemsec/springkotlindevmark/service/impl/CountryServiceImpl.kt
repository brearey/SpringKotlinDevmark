package ru.oktemsec.springkotlindevmark.service.impl

import org.springframework.stereotype.Service
import ru.oktemsec.springkotlindevmark.dto.CountryDto
import ru.oktemsec.springkotlindevmark.entity.CountryEntity
import ru.oktemsec.springkotlindevmark.repository.CountryRepository
import ru.oktemsec.springkotlindevmark.service.CountryService

@Service
class CountryServiceImpl(private val countryRepository: CountryRepository) : CountryService {
    override fun getAll(): List<CountryDto> {
        return countryRepository.findByOrderByName().map{
            it.toDto()
        }
    }

    override fun getByName(start: String): List<CountryDto> {
        return countryRepository.findByNameStartsWithOrderByName(start).map {
            it.toDto()
        }
    }

    private fun CountryEntity.toDto(): CountryDto =
        CountryDto(
            id = this.id,
            name = this.name,
            population = this.population
        )
}