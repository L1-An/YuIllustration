package com.github.l1an.yuillustration.internal.config

import taboolib.module.configuration.Config
import taboolib.module.configuration.Configuration

object Config {

    @Config("config.yml")
    lateinit var config: Configuration
        private set
}