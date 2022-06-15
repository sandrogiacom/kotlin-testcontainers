package com.giacom

import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class DemoTestcontainersTest {

    @Inject
    lateinit var application: EmbeddedApplication<*>

    @Inject
    lateinit var customerRepository: CustomerRepository

    @Test
    fun testItWorks() {
        var customer = Customer().apply {
            id = 1
            name = "Sandro Giacomozzi"
        }
        customerRepository.save(customer)

        customerRepository.findAll().forEach { println("${it.id} - ${it.name}") }

        Assertions.assertTrue(application.isRunning)
    }

}
