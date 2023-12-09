package com.github.l1an.yuillustration

import org.bukkit.Bukkit
import taboolib.common.platform.Platform
import taboolib.common.platform.Plugin
import taboolib.common.platform.function.console
import taboolib.common.platform.function.info
import taboolib.module.chat.colored
import taboolib.module.lang.Language
import taboolib.module.metrics.Metrics
import taboolib.platform.BukkitPlugin

object YuIllustration : Plugin() {

    val plugin by lazy {
        BukkitPlugin.getInstance()
    }

    override fun onLoad() {
        Language.default = "zh_CN"
    }

    override fun onEnable() {
        Metrics(20276, plugin.description.version, Platform.BUKKIT)
        console().sendMessage("&aYuIllustration has been loaded!".colored())
        console().sendMessage("&bAuthor by L1An".colored())
    }
}