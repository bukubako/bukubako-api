package com.bukubako.api.controller.response

data class SearchResponse(
        val keyword: String,
        val totalItems: Int,
        val items: List<ItemResponse>)

data class ItemResponse(
        val title: String,
        val description: String
)
