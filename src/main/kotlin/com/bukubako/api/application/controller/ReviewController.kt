package com.bukubako.api.application.controller

import com.bukubako.api.application.response.ReviewResponse
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("books/{bookId}/reviews")
class ReviewController {

    @GetMapping("{reviewId}")
    fun getById(@PathVariable bookId: String, @PathVariable reviewId: String): ReviewResponse =
            ReviewResponse(
                    "読書 太郎",
                    "2020年8月1日 13時00分",
                    "この本の感想",
                    "1章は面白かった。\n2章も面白かった。"
            )
}
