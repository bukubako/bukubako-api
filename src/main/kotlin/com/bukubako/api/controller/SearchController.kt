package com.bukubako.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchController {

    @GetMapping("search")
    fun get(): String {
        return "Search API called."
    }
}