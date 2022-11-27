package ru.innopolis.rabbitlistener.rabbitmq

data class MessageDto(
    val gender: Gender,
    val name: String
) {
    constructor(message: String) : this(
        gender = Gender.valueOf(message.split(":")[0]),
        name = message.split(":")[1]
    )

    override fun toString(): String {
        return "$gender:$name"
    }
}

enum class Gender {
    MALE, FEMALE
}
