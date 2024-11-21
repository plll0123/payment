package com.example.payment.domain

import org.springframework.stereotype.Service

@Service
class DomainService(
    private val testReader: TestReader
) {

    fun save(): Long {
        return testReader.save()
    }

    fun findById(id: Long): Test {
        return testReader.findById(id)
    }
}