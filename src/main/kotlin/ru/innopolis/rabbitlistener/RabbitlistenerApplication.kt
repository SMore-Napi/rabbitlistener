package ru.innopolis.rabbitlistener

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RabbitlistenerApplication

fun main(args: Array<String>) {
    runApplication<RabbitlistenerApplication>(*args)
}
