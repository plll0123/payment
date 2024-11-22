package com.example.payment.api

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/v1/toss")
class PaymentController {

    @GetMapping("/success")
    fun successPage(): String {
        return "success"
    }

    @GetMapping("/fail")
    fun failPage(): String {
        return "fail"
    }

}