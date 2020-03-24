package com.bukubako.api.service

import com.bukubako.api.domain.BookSummary
import com.bukubako.api.domain.SearchResult
import com.bukubako.api.repository.response.GoogleSearchResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder

@Service
class SearchService {

    @Autowired
    lateinit var restTemplate: RestTemplate

    fun search(keyword: String): SearchResult =
            restTemplate.getForObject(
                    UriComponentsBuilder.fromHttpUrl("https://www.googleapis.com")
                            .path("/books/v1/volumes")
                            .queryParam("q", keyword)
                            .build()
                            .toUri(),
                    GoogleSearchResponse::class.java)!!
                    .toSearchResult()
}