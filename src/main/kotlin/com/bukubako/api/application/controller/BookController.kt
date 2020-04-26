package com.bukubako.api.application.controller

import com.bukubako.api.application.response.BookResponse
import com.bukubako.api.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("books")
class BookController {

    @Autowired
    lateinit var service: BookService

    @CrossOrigin
    @GetMapping("{id}")
    fun get(@PathVariable id: String): BookResponse =
            BookResponse(service.get(id))
}
