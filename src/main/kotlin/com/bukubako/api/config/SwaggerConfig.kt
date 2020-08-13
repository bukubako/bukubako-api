package com.bukubako.api.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class SwaggerConfig {
    @Bean
    fun bukubakoApi(): Docket =
        Docket(DocumentationType.SWAGGER_2)
            .select()
            .paths(PathSelectors.any())
            .build()
            .useDefaultResponseMessages(false)
            .host("http://api-bukubako.herokuapp.com")
            .apiInfo(
                ApiInfoBuilder()
                    .title("Bukubako API")
                    .description("This provides APIs for Bukubako")
                    .version("1.0.0")
                    .build()
            )
}
