package com.github.l1an.yuillustration.internal.manager

import com.github.l1an.yuillustration.internal.config.Config

object ConfigManager {

    fun reload() {
        Config.config.reload()
    }
}