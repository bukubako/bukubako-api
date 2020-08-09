package com.bukubako.api.application.controller

import com.bukubako.api.application.response.ReviewResponse
import com.bukubako.api.application.response.ReviewsResponse
import com.bukubako.api.application.response.ReviewsResponseElement
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("books/{bookId}/reviews")
class ReviewController {

    @GetMapping
    fun getAll(@PathVariable bookId: String, @RequestParam page: Int?): ReviewsResponse =
            ReviewsResponse(
                    3,
                    listOf<ReviewsResponseElement>(
                            ReviewsResponseElement("読書 太郎", "2020年8月1日 13時00分", "この本の感想1"),
                            ReviewsResponseElement("読書 次郎", "2020年8月2日 13時00分", "この本の感想2"),
                            ReviewsResponseElement("読書 三朗", "2020年8月3日 13時00分", "この本の感想3")
                    ),
                    "http://example.com/path/to/next/page"
            )

    @GetMapping("{reviewId}")
    fun getById(@PathVariable bookId: String, @PathVariable reviewId: String): ReviewResponse =
            ReviewResponse(
                    "読書 太郎",
                    "2020年8月1日 13時00分",
                    "この本の感想1",
                    "1章は面白かった。\n2章も面白かった。"
            )
}
