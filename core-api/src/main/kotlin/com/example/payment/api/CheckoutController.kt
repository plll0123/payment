package com.example.payment.api

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class CheckoutController {

    @GetMapping
    fun checkoutPage() : String {
        return "checkout"
    }

}