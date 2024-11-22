package com.example.payment.toss

data class TossConfirmRequest(
    val paymentKey: String = "",
    val orderId: String = "",
    val amount: String = ""
)