package com.giacom

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/customers")
class CustomerController(val customerRepository: CustomerRepository) {

    @Get
    fun getPersons(): HttpResponse<Any> {
        return HttpResponse.status<Any>(HttpStatus.OK).body(this.customerRepository.findAll())
    }

}
