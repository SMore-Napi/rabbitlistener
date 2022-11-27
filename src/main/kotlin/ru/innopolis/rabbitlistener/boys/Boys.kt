package ru.innopolis.rabbitlistener.boys

import jakarta.persistence.*


@Entity
@Table(name = "boys")
class Boys {
    @Id
    @SequenceGenerator(name = "boys_generator", sequenceName = "boys_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "boys_generator")
    @Column(name = "id")
    var id: Int? = null

    @Column(name = "name")
    var name: String? = null
}
