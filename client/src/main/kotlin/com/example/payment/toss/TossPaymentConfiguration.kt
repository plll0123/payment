package com.example.payment.toss

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.client.RestClient
import java.util.*

@ConfigurationProperties(prefix = "psp.toss")
class TossPaymentConfiguration(
    private val url: String,
    private val secretKey: String,
) {

    @Bean
    fun tossApi(): RestClient {
        return RestClient.builder()
            .baseUrl(url)
            .defaultHeader(HttpHeaders.AUTHORIZATION, encodeSecretKey(secretKey))
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build()
    }

    private fun encodeSecretKey(secretKey: String): String {
        val defaultBasicHeaderFormat = "$secretKey:"
        val encodedString = Base64.getEncoder().encodeToString(defaultBasicHeaderFormat.toByteArray())
        return "Basic $encodedString"
    }

}
