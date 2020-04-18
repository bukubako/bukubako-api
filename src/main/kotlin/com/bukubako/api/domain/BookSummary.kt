package com.bukubako.api.domain

class BookSummary(private val id: String, private val title: String, private val authors: List<String>) {
    fun id(): String = id
    fun title(): String = title
    fun authors(): List<String> = authors
}
