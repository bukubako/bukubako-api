package com.bukubako.api.domain

import java.net.URI

class SearchResult(
        private val hitCount: Int,
        private val bookSummaries: List<BookSummary>?,
        private val keyword: String,
        private val currentPage: Int) {

    fun hitCount(): Int = hitCount
    fun bookSummaries(): List<BookSummary> = bookSummaries ?: emptyList()
    fun nextPageUri(): URI =
            URI("https://api-bukubako.herokuapp.com/search?q=${keyword}&page=${currentPage.inc()}") // TODO generate host name
}
