package ru.oktemsec.springkotlindevmark.service.impl

import org.springframework.stereotype.Service
import ru.oktemsec.springkotlindevmark.dto.CountryDto
import ru.oktemsec.springkotlindevmark.service.CountryService

@Service
class CountryServiceImpl : CountryService {
    override fun getAll(): List<CountryDto> {
        return listOf(
            CountryDto(
                id = 1,
                "USA",
                1_500_000
            ),
            CountryDto(
                id = 2,
                "China",
                100_500_000
            ),
            CountryDto(
                id = 3,
                "USA",
                1_500_000
            ),
        )
    }
}