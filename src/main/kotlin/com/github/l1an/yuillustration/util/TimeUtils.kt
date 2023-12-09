package com.github.l1an.yuillustration.util

import taboolib.module.configuration.Configuration
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun formatTimeFormat(
    config : Configuration,
    timeFormatKey : String
) : String {
    val now = LocalDateTime.now()
    return timeFormatKey
        .replace("%YYYY%", now.format(DateTimeFormatter.ofPattern("yyyy")))
        .replace("%MM%", now.format(DateTimeFormatter.ofPattern("MM")))
        .replace("%DD%", now.format(DateTimeFormatter.ofPattern("dd")))
        .replace("%HH%", now.format(DateTimeFormatter.ofPattern("HH")))
        .replace("%mm%", now.format(DateTimeFormatter.ofPattern("mm")))
        .replace("%ss%", now.format(DateTimeFormatter.ofPattern("ss")))
        .replace("&", "§")
}