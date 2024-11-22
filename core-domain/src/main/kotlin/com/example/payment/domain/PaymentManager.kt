package com.example.payment.domain

interface PaymentManager {

    fun confirm(confirm: Any, paymentType: PaymentType): String
}