package com.github.l1an.yuillustration.internal.core.listener

import com.github.l1an.yuillustration.util.data
import org.bukkit.event.player.PlayerJoinEvent
import taboolib.common.platform.event.EventPriority
import taboolib.common.platform.event.SubscribeEvent
import taboolib.expansion.setupDataContainer

object PlayerJoinEvent {

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    fun onPlayerJoin(e : PlayerJoinEvent) {
        val player = e.player

        player.setupDataContainer()
        player.data

    }
}