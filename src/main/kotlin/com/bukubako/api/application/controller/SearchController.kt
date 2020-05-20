package com.bukubako.api.application.controller

import com.bukubako.api.application.response.SearchResponse
import com.bukubako.api.service.SearchService
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchController {

    @Autowired
    lateinit var service: SearchService

    @ApiOperation(value = "This resource fetch the search result by a keyword")
    @CrossOrigin
    @GetMapping("search")
    fun get(@RequestParam("q") q: String, @RequestParam("page") page: Int?): SearchResponse =
            SearchResponse(service.search(q, page?: 0))
}
