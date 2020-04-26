package com.bukubako.api.application.response

import com.bukubako.api.domain.Book

data class BookResponse(
        val title: String,
        val authors: List<String>,
        val description: String,
        val publishedDate: String,
        val imageUri: String) {

    constructor(book: Book): this(
            book.title(),
            book.authors(),
            book.description(),
            book.publishedDate(),
            book.imageUri()
    )
}
