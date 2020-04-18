package com.bukubako.api.application.response

import com.bukubako.api.domain.SearchResult

data class SearchResponse(
        val hitCount: Int,
        val items: List<ItemResponse>) {

    constructor(searchResult: SearchResult): this(
            searchResult.hitCount(),
            searchResult.bookSummaries().map { ItemResponse(it.title(), it.authors()) })
}

data class ItemResponse(
        val title: String,
        val authors: List<String>)
