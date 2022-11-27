package ru.innopolis.rabbitlistener.girls

import jakarta.persistence.*


@Entity
@Table(name = "girls")
class Girls {
    @Id
    @SequenceGenerator(name = "girls_generator", sequenceName = "girls_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "girls_generator")
    @Column(name = "id")
    var id: Int? = null

    @Column(name = "name")
    var name: String? = null
}
