package com.bukubako.api.application.controller

import com.bukubako.api.application.request.SearchRequest
import com.bukubako.api.application.response.SearchResponse
import com.bukubako.api.service.SearchService
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
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
    fun get(@ApiParam(value = "Search keyword", required = false) @RequestParam("q") q: String?,
            @ApiParam(value = "Page number of search result (zero-based indexing)", required = false) @RequestParam("page") page: Int?,
            @ApiParam(value = "ISBN10 or ISBN13", required = false) @RequestParam("isbn") isbn: String?): SearchResponse =
        SearchResponse(service.search(SearchRequest(q, page, isbn)))
}
