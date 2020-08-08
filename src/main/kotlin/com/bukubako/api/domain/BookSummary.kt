package com.bukubako.api.domain

import java.net.URI

class BookSummary(private val id: String, private val title: String, private val authors: List<String>) {
    fun title(): String = title
    fun authors(): List<String> = authors
    fun image(): URI = URI("http://books.google.com/books/content?id=lUrkAAAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api")
    fun detailUri(): URI =
            URI("https://api-bukubako.herokuapp.com/books/$id") // TODO generate host name
}
