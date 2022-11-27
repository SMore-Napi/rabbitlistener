package ru.innopolis.rabbitlistener.girls

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class GirlsService(
    private val girlsRepository: GirlsRepository
) {
    @Transactional
    fun save(girlName: String) {
        val girl = Girls().apply {
            name = girlName
        }
        girlsRepository.save(girl)
    }
}
