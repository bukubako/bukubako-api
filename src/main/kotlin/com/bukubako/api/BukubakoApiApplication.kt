package com.bukubako.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableSwagger2
class BukubakoApiApplication

fun main(args: Array<String>) {
	runApplication<BukubakoApiApplication>(*args)
}

@Bean
fun bukubakoApi(): Docket =
		Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/search"))
				.build()
				.useDefaultResponseMessages(false)
				.host("springbootswagger.example.com")
				.apiInfo(ApiInfoBuilder()
						.title("Bukubako API")
						.description("This provides APIs for Bukubako")
						.version("1.0.0")
						.build())
