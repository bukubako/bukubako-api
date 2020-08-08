package com.bukubako.api.domain

import java.net.URI

class BookSummary(private val id: String, private val title: String, private val imageUri: String, private val authors: List<String>) {
    fun title(): String = title
    fun authors(): List<String> = authors
    fun imageUri(): URI = URI(imageUri)
    fun detailUri(): URI =
            URI("https://api-bukubako.herokuapp.com/books/$id") // TODO generate host name
}
