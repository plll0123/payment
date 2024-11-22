package com.example.payment.api

import com.example.payment.api.request.TossConfirmRequest
import com.example.payment.common.ApiResponse
import com.example.payment.domain.PaymentService
import com.example.payment.domain.PaymentType
import com.example.payment.toss.TossPaymentApi
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/toss")
class TossPaymentController(
    private val tossPaymentService: PaymentService,
) {

    @PostMapping("/confirm")
    fun confirm(
        @RequestBody tosspay: com.example.payment.toss.TossConfirmRequest,
    ): ApiResponse<String> {
        val paymentConfirm = tossPaymentService.paymentConfirm(tosspay, PaymentType.TOSS)
        return ApiResponse.ok(data = paymentConfirm)
    }

}