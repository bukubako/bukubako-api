package com.bukubako.api.domain

import java.time.LocalDate
import java.time.Year
import java.time.YearMonth
import java.time.format.DateTimeFormatter
import java.time.temporal.TemporalAccessor

class PublishedDate(private val string: String) {

    fun value(): String = string

}
