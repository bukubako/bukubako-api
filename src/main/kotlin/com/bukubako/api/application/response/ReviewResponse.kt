package com.bukubako.api.application.response

import io.swagger.annotations.ApiModelProperty

data class ReviewResponse(
        @ApiModelProperty(value = "Author name of the review") val author: String,
        @ApiModelProperty(value = "Date time the review post",example = "2020年01月01日") val wroteDateTime: String,
        @ApiModelProperty(value = "Title of the review") val title: String,
        @ApiModelProperty(value = "Body of the review") val body: String
)
