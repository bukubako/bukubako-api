package com.bukubako.api.controller

import com.bukubako.api.controller.response.ItemResponse
import com.bukubako.api.controller.response.SearchResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchController {

    @GetMapping("search")
    fun get(@RequestParam("q") q: String): SearchResponse =
            SearchResponse(
                    q,
                    2,
                    listOf(
                            ItemResponse("タイトル1", "説明1"),
                            ItemResponse("タイトル2", "説明2")
                    )
            )
}