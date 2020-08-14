package com.bukubako.api.service

import com.bukubako.api.domain.Book
import com.bukubako.api.repository.response.GoogleBook
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder

@Service
class BookService {

    @Autowired
    lateinit var restTemplate: RestTemplate

    fun get(id: String): Book =
        restTemplate.getForObject(
            UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("www.googleapis.com")
                .path("/books/v1/volumes/")
                .path(id)
                .build()
                .toUri(),
            GoogleBook::class.java
        )!!
            .toBook()
}
