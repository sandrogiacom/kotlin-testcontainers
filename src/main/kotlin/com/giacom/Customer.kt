package com.giacom

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Customer {
    @Id
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @Column(name = "name")
    var name: String? = null
}
