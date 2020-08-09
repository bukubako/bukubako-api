package com.bukubako.api.application.response

import io.swagger.annotations.ApiModelProperty

data class ReviewsResponse(
        @ApiModelProperty(value = "Number of reviews") val hitCount: Int,
        val reviews: List<ReviewsResponseElement>,
        val nextPageUri: String
)

data class ReviewsResponseElement(
        @ApiModelProperty(value = "Author of the review") val author: String,
        @ApiModelProperty(value = "Date time the review post") val wroteDateTime: String,
        @ApiModelProperty(value = "Title of the review") val title: String
)
