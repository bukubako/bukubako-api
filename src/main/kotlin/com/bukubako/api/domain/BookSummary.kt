package com.bukubako.api.domain

class BookSummary(private val title: String, private val description: String) {
    fun title(): String = title
    fun description(): String = description
}
