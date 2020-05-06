package com.bukubako.api.domain

import java.time.LocalDate
import java.time.Year
import java.time.YearMonth
import java.time.format.DateTimeFormatter
import java.time.temporal.TemporalAccessor

class PublishedDate(private val string: String) {

    fun value(): String =
            when {
                string.matches(Regex("\\d{4}-\\d{2}-\\d{2}")) ->
                    LocalDate.parse(string).format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"))

                string.matches(Regex("\\d{4}-\\d{2}")) ->
                    YearMonth.parse(string).format(DateTimeFormatter.ofPattern("yyyy年MM月"))

                string.matches(Regex("\\d{4}")) ->
                    Year.parse(string).format(DateTimeFormatter.ofPattern("yyyy年"))

                else ->
                    throw IllegalArgumentException("年月日の形式が不正: $string")
            }
}
