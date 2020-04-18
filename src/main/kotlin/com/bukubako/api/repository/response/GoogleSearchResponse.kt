package com.bukubako.api.repository.response

import com.bukubako.api.domain.BookSummary
import com.bukubako.api.domain.SearchResult
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class GoogleSearchResponse(
        val kind: String,
        val totalItems: Int,
        val items: List<GoogleItem>) {

    fun toSearchResult(keyword: String, currentPage: Int): SearchResult =
            SearchResult(
                    totalItems,
                    items.map { BookSummary(
                            it.id,
                            it.volumeInfo.title,
                            it.volumeInfo.authors) },
                    keyword,
                    currentPage)
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class GoogleItem(
        val id: String,
        val volumeInfo: GoogleVolumeInfo)

@JsonIgnoreProperties(ignoreUnknown = true)
data class GoogleVolumeInfo(
        val title: String,
        val authors: List<String> = emptyList(),
        val publisher: String = "",
        val publishedDate: String = "",
        val description: String = "",
        val categories: List<String> = emptyList(),
        val imageLinks: GoogleImageLinks = GoogleImageLinks("", ""))

@JsonIgnoreProperties(ignoreUnknown = true)
data class GoogleImageLinks(
        val smallThumbnail: String = "",
        val thumbnail: String = "")
