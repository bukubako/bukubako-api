package com.bukubako.api.application.response

import com.bukubako.api.domain.SearchResult
import io.swagger.annotations.ApiModelProperty
import org.springframework.web.util.UriComponentsBuilder

data class SearchResponse(
    @ApiModelProperty(example = "123") val hitCount: Int,
    val items: List<ItemResponse>,
    @ApiModelProperty(
        example = "https://api.bukubako.com/path/to/next/page"
    ) val nextPageUri: String
) {

    constructor(searchResult: SearchResult) : this(
        searchResult.hitCount(),
        searchResult.bookSummaries()
            .map { ItemResponse(it.title(), it.authors(), it.imageUri().toString(), it.detailUri().toString()) },
        searchResult.nextPageUri().toString()
    )
}

data class ItemResponse(
    @ApiModelProperty(example = "book title") val title: String,
    @ApiModelProperty(example = "[author1, author2]") val authors: List<String>,
    @ApiModelProperty(example = "https://example.com/path/to/book/image") val imageUri: String,
    @ApiModelProperty(example = "https://api.bukubako.com/path/to/book/detail") val detailUri: String
)
