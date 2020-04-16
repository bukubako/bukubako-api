package com.bukubako.api.application.controller

import com.bukubako.api.application.response.BookResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("books")
class BookController {

    @GetMapping("{isbn13}")
    fun get(@PathVariable isbn13: String): BookResponse =
            BookResponse(
                    "夏目漱石 思想の比較と未知の探究",
                    listOf("宮本盛太郎", "関静雄"),
                    "未知の装石像とその周辺事実に迫る",
                    "2000-02",
                    "http://books.google.com/books/content?id=l-cqAQAAIAAJ&printsec=frontcover&img=1&zoom=5&source=gbs_api")
}
