package com.bukubako.api.domain

class SearchResult(private val hitCount: Int, private val bookSummaries: List<BookSummary>) {
    fun hitCount(): Int = hitCount
    fun bookSummaries(): List<BookSummary> = bookSummaries
}