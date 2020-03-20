package com.bukubako.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchController {

    @GetMapping("search")
    fun get(@RequestParam("q") q: String): String = "Search API called. Keyword is ${q}"
}