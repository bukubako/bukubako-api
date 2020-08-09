package com.bukubako.api.application.response

data class ReviewsResponse(
        val hitCount: Int,
        val reviews: List<ReviewsResponseElement>,
        val nextPageUri: String
)

data class ReviewsResponseElement(
        val author: String,
        val wroteDateTime: String,
        val title: String
)
