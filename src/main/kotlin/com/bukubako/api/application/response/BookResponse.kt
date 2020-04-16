package com.bukubako.api.application.response

data class BookResponse(
        val title: String,
        val authors: List<String>,
        val description: String,
        val publishedDate: String,
        val imageUri: String
)
