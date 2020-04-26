package com.bukubako.api.domain

class Book(private val title: String,
           private val authors: List<String>,
           private val description: String,
           private val publishedDate: String,
           private val imageUri: String) {

    fun title(): String = title
    fun authors(): List<String> = authors
    fun description(): String = description
    fun publishedDate(): String = publishedDate
    fun imageUri(): String = imageUri
}
