package com.example.payment.domain

import org.springframework.stereotype.Component

@Component
class TestReader(
    private val testRepository: TestRepository
) {

    fun save(): Long {
        return testRepository.save(Test())
    }

    fun findById(id: Long): Test {
        return testRepository.findById(id)
            ?: throw IllegalArgumentException("entity not found")
    }

}