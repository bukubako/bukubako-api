package com.bukubako.api.application.response

import com.bukubako.api.domain.SearchResult

data class SearchResponse(
        val keyword: String,
        val totalItems: Int,
        val items: List<ItemResponse>) {

    constructor(keyword: String, searchResult: SearchResult): this(
            keyword,
            searchResult.totalItems(),
            searchResult.bookSummaries().map { ItemResponse(it.title(), it.description()) }
    )
}
