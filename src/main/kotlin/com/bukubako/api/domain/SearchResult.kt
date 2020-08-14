package com.bukubako.api.domain

import org.springframework.web.util.UriComponentsBuilder
import java.net.URI

class SearchResult(
    private val hitCount: Int,
    private val bookSummaries: List<BookSummary>?,
    private val keyword: String,
    private val currentPage: Int
) {

    fun hitCount(): Int = hitCount
    fun bookSummaries(): List<BookSummary> = bookSummaries ?: emptyList()
    fun nextPageUri(): URI =
        UriComponentsBuilder.newInstance()
            .scheme("https")
            .host("api.bukubako.com") // TODO generate host name
            .path("/search")
            .queryParam("q", keyword)
            .queryParam("page", currentPage.inc())
            .build()
            .toUri()
}
