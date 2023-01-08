package ru.oktemsec.springkotlindevmark

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinDevmarkApplication

fun main(args: Array<String>) {
    runApplication<SpringKotlinDevmarkApplication>(*args)
}
