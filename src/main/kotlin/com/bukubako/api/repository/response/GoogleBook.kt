package com.bukubako.api.repository.response

import com.bukubako.api.domain.Book
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class GoogleBook(
        val id: String,
        val volumeInfo: GoogleVolumeInfo) {

    fun toBook(): Book =
            Book(
                    volumeInfo.title,
                    volumeInfo.authors,
                    volumeInfo.description,
                    volumeInfo.publishedDate,
                    volumeInfo.imageLinks.thumbnail
            )
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class GoogleVolumeInfo(
        val title: String,
        val authors: List<String> = emptyList(),
        val publisher: String = "",
        val publishedDate: String = "",
        val description: String = "",
        val categories: List<String> = emptyList(),
        val imageLinks: GoogleImageLinks = GoogleImageLinks("", ""))

@JsonIgnoreProperties(ignoreUnknown = true)
data class GoogleImageLinks(
        val smallThumbnail: String = "",
        val thumbnail: String = "")
