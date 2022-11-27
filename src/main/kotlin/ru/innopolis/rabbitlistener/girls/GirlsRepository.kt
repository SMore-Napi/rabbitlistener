package ru.innopolis.rabbitlistener.girls

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GirlsRepository : CrudRepository<Girls, Int>