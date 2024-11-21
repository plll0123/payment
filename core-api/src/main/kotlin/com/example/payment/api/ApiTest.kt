package com.example.payment.api

import com.example.payment.domain.DomainService
import com.example.payment.domain.Test
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping
@RestController
class ApiTest(
    private val domainService: DomainService
) {

    @GetMapping("/hello")
    fun hello(): String {
        return domainService.save()
            .toString()
    }

    @GetMapping("/get")
    fun get(id: Long): Map<String, String> {
        val findById = domainService.findById(id)
        return mapOf(
            Pair(findById.id.toString(), "123123")
        )
    }
}