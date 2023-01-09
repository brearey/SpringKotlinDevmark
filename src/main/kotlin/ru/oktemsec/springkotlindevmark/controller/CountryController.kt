package ru.oktemsec.springkotlindevmark.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
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
    fun getAll(@RequestParam("page") pageIndex: Int): List<CountryDto> = countryService.getAll(pageIndex)

    @GetMapping("/search")
    @ResponseBody
    fun searchCountries(@RequestParam("text") searchText: String): List<CountryDto> = countryService.search(searchText)

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Int): CountryDto = countryService.getById(id)
}