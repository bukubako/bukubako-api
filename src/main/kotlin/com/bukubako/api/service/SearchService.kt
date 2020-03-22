package com.bukubako.api.service

import com.bukubako.api.domain.BookSummary
import com.bukubako.api.domain.SearchResult
import org.springframework.stereotype.Service

@Service
class SearchService {

    fun search(keyword: String): SearchResult =
            SearchResult(
                    2,
                    listOf(
                            BookSummary("タイトル1", "説明1"),
                            BookSummary("タイトル2", "説明2"))
    )
}
