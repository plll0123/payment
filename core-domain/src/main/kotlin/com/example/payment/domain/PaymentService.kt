package com.example.payment.domain

import org.springframework.stereotype.Service

@Service
class PaymentService(
    private val paymentManager: PaymentManager
) {

    fun paymentConfirm(paymentConfirm: Any, paymentType: PaymentType) : String{
        return paymentManager.confirm(paymentConfirm, paymentType)
    }
}