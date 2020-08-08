package com.bukubako.api.repository.response

import com.bukubako.api.domain.BookSummary
import com.bukubako.api.domain.SearchResult
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class GoogleSearchResponse(
        val kind: String,
        val totalItems: Int,
        val items: List<GoogleBook>?) {

    fun toSearchResult(keyword: String, currentPage: Int): SearchResult =
            SearchResult(
                    totalItems,
                    items?.map { BookSummary(
                            it.id,
                            it.volumeInfo.title,
                            it.volumeInfo.imageLinks.smallThumbnail,
                            it.volumeInfo.authors) },
                    keyword,
                    currentPage)
}
