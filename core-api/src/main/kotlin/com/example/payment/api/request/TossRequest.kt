package com.example.payment.api.request

data class TossConfirmRequest(
    val paymentKey: String = "",
    val orderId: String = "",
    val amount: String = "",
    val asd: String?
)