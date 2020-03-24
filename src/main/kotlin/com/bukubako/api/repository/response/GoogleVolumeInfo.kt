package com.bukubako.api.repository.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class GoogleVolumeInfo(val title: String)
