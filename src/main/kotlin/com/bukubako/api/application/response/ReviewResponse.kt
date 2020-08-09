package com.bukubako.api.application.response

data class ReviewResponse(
        val author: String,
        val wroteDateTime: String,
        val title: String,
        val body: String
)
