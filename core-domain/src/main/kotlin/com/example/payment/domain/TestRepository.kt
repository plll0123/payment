package com.example.payment.domain

interface TestRepository {

    fun save(test: Test): Long
    fun findById(id: Long): Test?
}