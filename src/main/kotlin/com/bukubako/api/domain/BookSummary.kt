package com.bukubako.api.domain

import java.net.URI

class BookSummary(private val id: String, private val title: String, private val authors: List<String>) {
    fun title(): String = title
    fun authors(): List<String> = authors
    fun detailUri(): String =
            URI("https://api-bukubako.herokuapp.com/books/$id").toString() // TODO generate host name
}
