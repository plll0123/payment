package com.example.payment.entity

import com.example.payment.domain.Test
import com.example.payment.domain.TestRepository
import org.springframework.data.repository.Repository
import java.util.*

interface TestEntityRepository : Repository<TestEntity, Long>, TestRepository {

    override fun save(test: Test): Long {
        return save(TestEntity()).id
    }

    fun save(test: TestEntity): TestEntity

    override fun findById(id: Long): Test? {
        return when (val findEntityById = findEntityById(id)) {
            null -> null
            else -> Test(findEntityById.id)
        }
    }

    fun findEntityById(id: Long): TestEntity?
}