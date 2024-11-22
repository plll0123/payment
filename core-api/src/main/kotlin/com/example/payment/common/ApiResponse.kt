package com.example.payment.common

import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode

data class ApiResponse<T>(
    val status: Int = 200,
    val message: String = "",
    val data: T? = null,
) {

    companion object {
        fun <T> ok(
            httpStatus: HttpStatusCode = HttpStatus.OK,
            message: String = HttpStatus.OK.name,
            data: T? = null,
        ): ApiResponse<T> {
            return ApiResponse(httpStatus.value(), message, data)
        }
    }
}