package com.bukubako.api.repository.response

import com.bukubako.api.domain.BookSummary
import com.bukubako.api.domain.SearchResult
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class GoogleSearchResponse(val totalItems: Int, val items: List<GoogleItem>) {
    fun toSearchResult(): SearchResult =
            SearchResult(totalItems, items.map { BookSummary(it.volumeInfo.title) })
}
