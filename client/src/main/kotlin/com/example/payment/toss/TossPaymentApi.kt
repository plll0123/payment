package com.example.payment.toss

import org.springframework.web.client.RestClient

class TossPaymentApi(
    private val restClient: RestClient,
) {

    companion object {
        const val PAYMENT_CONFIRM_URI = "/v1/payments/confirm"
    }

    fun paymentConfirm(any: Any): String {
        val confirmRequest = any as TossConfirmRequest
        val body = restClient.post()
            .uri(PAYMENT_CONFIRM_URI)
            .body(
                """
                {
                    "paymentKey": "${confirmRequest.paymentKey}",
                    "orderId": "${confirmRequest.orderId}",
                    "amount": "${confirmRequest.amount}"
                }
            """.trimIndent()
            )
            .retrieve()
            .body(Map::class.java)
        println(body)
        println(body)
        println(body)
        println(body)
        println(body)
        println(body)
        println(body)
        println(body)
        println(body)
        println(body)
        println(body)
        println(body)
        return body.toString()
    }
}