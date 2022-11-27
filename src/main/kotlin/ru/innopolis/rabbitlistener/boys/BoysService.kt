package ru.innopolis.rabbitlistener.boys

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BoysService(
    private val boysRepository: BoysRepository
) {
    @Transactional
    fun save(boyName: String) {
        val boy = Boys().apply {
            name = boyName
        }
        boysRepository.save(boy)
    }
}
