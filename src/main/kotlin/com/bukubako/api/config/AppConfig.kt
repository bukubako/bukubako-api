package com.bukubako.api.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "app")
class AppConfig {
    lateinit var scheme: String
    lateinit var host: String
}
