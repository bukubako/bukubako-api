package com.bukubako.api.application.response

import com.bukubako.api.domain.SearchResult
import io.swagger.annotations.ApiModelProperty

data class SearchResponse(
        val hitCount: Int,
        val items: List<ItemResponse>,
        @ApiModelProperty(example = "https://api-bukubako.herokuapp.com/path/to/next/page") val nextPageUri: String) {

    constructor(searchResult: SearchResult): this(
            searchResult.hitCount(),
            searchResult.bookSummaries().map { ItemResponse(it.title(), it.authors(), it.detailUri().toString()) },
            searchResult.nextPageUri().toString())
}

data class ItemResponse(
        val title: String,
        val authors: List<String>,
        @ApiModelProperty(example = "https://api-bukubako.herokuapp.com/path/to/book/detail") val detailUri: String)
