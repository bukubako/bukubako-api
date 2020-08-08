package com.bukubako.api.application.response

import com.bukubako.api.domain.SearchResult
import io.swagger.annotations.ApiModelProperty

data class SearchResponse(
        @ApiModelProperty(example = "123") val hitCount: Int,
        val items: List<ItemResponse>,
        @ApiModelProperty(example = "https://api-bukubako.herokuapp.com/path/to/next/page") val nextPageUri: String) {

    constructor(searchResult: SearchResult): this(
            searchResult.hitCount(),
            searchResult.bookSummaries().map { ItemResponse(it.title(), it.authors(), "http://books.google.com/books/content?id=lUrkAAAAQBAJ&printsec=frontcover&img=1&zoom=5", it.detailUri().toString()) },
            searchResult.nextPageUri().toString())
}

data class ItemResponse(
        @ApiModelProperty(example = "book title") val title: String,
        @ApiModelProperty(example = "[author1, author2]") val authors: List<String>,
        @ApiModelProperty(example = "https://example.com/path/to/book/image") val imageUri: String,
        @ApiModelProperty(example = "https://api-bukubako.herokuapp.com/path/to/book/detail") val detailUri: String)
