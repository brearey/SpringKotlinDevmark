package ru.oktemsec.springkotlindevmark.entity

import jakarta.persistence.*


@Entity
@Table(name = "country")
class CountryEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val name: String = "",
    val population: Int = 0,
)