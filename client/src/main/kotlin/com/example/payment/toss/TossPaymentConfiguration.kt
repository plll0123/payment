package com.example.payment.toss

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.client.RestClient
import java.util.*

@ConfigurationProperties(prefix = "psp.toss")
internal class TossPaymentConfiguration(
    private val url: String,
    private val secretKey: String,
) {

    @Bean
    fun tossApi(): TossPaymentApi {
        val restClient = RestClient.builder()
            .baseUrl(url)
            .defaultHeader(HttpHeaders.AUTHORIZATION, encodeSecretKey(secretKey))
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build()
        return TossPaymentApi(restClient)
    }

    private fun encodeSecretKey(secretKey: String): String {
        val defaultBasicHeaderFormat = "$secretKey:"
        val encodedString = Base64.getEncoder().encodeToString(defaultBasicHeaderFormat.toByteArray())
        return "Basic $encodedString"
    }

}
