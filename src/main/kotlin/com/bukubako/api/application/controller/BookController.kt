package com.bukubako.api.application.controller

import com.bukubako.api.application.response.BookResponse
import com.bukubako.api.service.BookService
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("books")
class BookController {

    @Autowired
    lateinit var service: BookService

    @ApiOperation(value = "This Resource fetch a book by id")
    @CrossOrigin
    @GetMapping("{id}")
    fun get(@ApiParam(value = "Book id provided by google books") @PathVariable id: String): BookResponse =
            BookResponse(service.get(id))
}
