package ru.oktemsec.springkotlindevmark.service.impl

import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import ru.oktemsec.springkotlindevmark.dto.CountryDto
import ru.oktemsec.springkotlindevmark.entity.CountryEntity
import ru.oktemsec.springkotlindevmark.repository.CountryRepository
import ru.oktemsec.springkotlindevmark.service.CountryService

private const val PAGE_SIZE = 2
@Service
class CountryServiceImpl(private val countryRepository: CountryRepository) : CountryService {
    override fun getAll(pageIndex: Int): List<CountryDto> {
        return countryRepository.findByOrderByName(PageRequest.of(pageIndex, PAGE_SIZE)).map{
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