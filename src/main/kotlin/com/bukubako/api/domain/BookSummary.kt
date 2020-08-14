package com.bukubako.api.domain

import org.springframework.web.util.UriComponentsBuilder
import java.net.URI

class BookSummary(
    private val id: String,
    private val title: String,
    private val imageUri: String,
    private val authors: List<String>
) {
    fun title(): String = title
    fun authors(): List<String> = authors
    fun imageUri(): URI = URI(imageUri)
    fun detailUri(): URI =
        UriComponentsBuilder.newInstance()
            .scheme("https")
            .host("api.bukubako.com") // TODO generate host name
            .path("/books/$id")
            .build()
            .toUri()
}
