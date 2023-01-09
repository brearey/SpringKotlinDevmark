package ru.oktemsec.springkotlindevmark.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import ru.oktemsec.springkotlindevmark.dto.CountryDto
import ru.oktemsec.springkotlindevmark.service.CountryService

@RestController
@RequestMapping("/countries")
class CountryController(
    private val countryService: CountryService,
) {
    @GetMapping
    fun getAll(): List<CountryDto> = countryService.getAll()

    @GetMapping("/find")
    @ResponseBody
    fun getByName(@RequestParam("name") start: String): List<CountryDto> = countryService.getByName(start)
}