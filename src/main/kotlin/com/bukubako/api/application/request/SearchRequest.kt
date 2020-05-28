package com.bukubako.api.application.request

class SearchRequest(private val q: String?, private val page: Int?, private val isbn: String?) {
    fun keyword(): String =
            if (isbn != null) "isbn:$isbn" else q!!

    fun page(): Int =
            page ?: 0
}
