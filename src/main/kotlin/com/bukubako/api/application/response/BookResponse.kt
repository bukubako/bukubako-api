package com.bukubako.api.application.response

import com.bukubako.api.domain.Book
import io.swagger.annotations.ApiModelProperty

data class BookResponse(
        val title: String,
        val authors: List<String>,
        val description: String,
        @ApiModelProperty(example = "yyyy年MM月dd日, yyyy年MM月, or yyyy年") val publishedDate: String,
        @ApiModelProperty(example = "https://example.com/path/to/image") val imageUri: String) {

    constructor(book: Book): this(
            book.title(),
            book.authors(),
            book.description(),
            book.publishedDate().value(),
            book.imageUri()
    )
}
