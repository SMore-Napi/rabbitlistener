package ru.innopolis.rabbitlistener.rabbitmq

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component
import ru.innopolis.rabbitlistener.boys.BoysService
import ru.innopolis.rabbitlistener.girls.GirlsService

@EnableRabbit
@Component
class RabbitMqListener(
    private val girlsService: GirlsService,
    private val boysService: BoysService,
) {
    @RabbitListener(queues = ["\${rabbit.queueName}"])
    fun processMyQueue(message: String) {
        println("Received: $message")
        val messageDto = MessageDto(message)

        when (messageDto.gender) {
            Gender.FEMALE -> {
                girlsService.save(messageDto.name)
            }

            Gender.MALE -> {
                boysService.save(messageDto.name)
            }
        }
    }
}
