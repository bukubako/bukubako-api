package com.bukubako.api.application.controller

import com.bukubako.api.application.response.ReviewResponse
import com.bukubako.api.application.response.ReviewsResponse
import com.bukubako.api.application.response.ReviewsResponseElement
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("books/{bookId}/reviews")
class ReviewController {

    @ApiOperation(value = "This Resource fetch reviews of a book by book id")
    @CrossOrigin
    @GetMapping
    fun getAll(@ApiParam(value = "Book id provided by google books") @PathVariable bookId: String,
               @ApiParam(value = "Page number of reviews (zero-based indexing)") @RequestParam page: Int?): ReviewsResponse =
            ReviewsResponse(
                    3,
                    listOf<ReviewsResponseElement>(
                            ReviewsResponseElement("読書 太郎", "2020年8月1日 13時00分", "この本の感想1", "http://sample.com/path/to/detail"),
                            ReviewsResponseElement("読書 次郎", "2020年8月2日 13時00分", "この本の感想2", "http://sample.com/path/to/detail"),
                            ReviewsResponseElement("読書 三朗", "2020年8月3日 13時00分", "この本の感想3", "http://sample.com/path/to/detail")
                    ),
                    "http://example.com/path/to/next/page"
            )

    @ApiOperation(value = "This Resource fetch a review of a book by book id and review id")
    @CrossOrigin
    @GetMapping("{reviewId}")
    fun getById(@ApiParam(value = "Book ID provided by google books") @PathVariable bookId: String,
                @ApiParam(value = "Review ID") @PathVariable reviewId: String): ReviewResponse =
            ReviewResponse(
                    "読書 太郎",
                    "2020年8月1日 13時00分",
                    "この本の感想1",
                    "1章は面白かった。\n2章も面白かった。"
            )
}
