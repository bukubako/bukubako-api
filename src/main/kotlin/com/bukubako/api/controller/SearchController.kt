package com.bukubako.api.controller

import com.bukubako.api.controller.response.ItemResponse
import com.bukubako.api.controller.response.SearchResponse
import com.bukubako.api.service.SearchService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchController {

    @Autowired
    lateinit var service: SearchService

    @GetMapping("search")
    fun get(@RequestParam("q") q: String): SearchResponse =
            SearchResponse(q, service.search(q))
}