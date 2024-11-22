package com.example.payment

import com.example.payment.domain.PaymentManager
import com.example.payment.domain.PaymentType
import com.example.payment.domain.PaymentType.*
import com.example.payment.toss.TossPaymentApi
import org.springframework.stereotype.Component

@Component
class PaymentApiExecutor(
    private val tossPaymentApi: TossPaymentApi
) : PaymentManager{

    override fun confirm(confirm: Any, paymentType: PaymentType): String {
        return when (paymentType) {
            TOSS -> tossPaymentApi.paymentConfirm(confirm)
        }
    }

}