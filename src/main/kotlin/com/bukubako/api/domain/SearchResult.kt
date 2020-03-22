package com.bukubako.api.domain

class SearchResult(private val totalItmes: Int, private val bookSummaries: List<BookSummary>) {
    fun totalItems(): Int = totalItmes
    fun bookSummaries(): List<BookSummary> = bookSummaries
}