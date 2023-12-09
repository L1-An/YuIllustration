package com.github.l1an.yuillustration.internal.data

import org.bukkit.entity.Player
import taboolib.expansion.getDataContainer
import java.util.*
import java.util.concurrent.ConcurrentHashMap

class PlayerData(val player : Player) {

    val test get() = player.getDataContainer()["test"]

    fun setTest(value : String) {
        player.getDataContainer()["test"] = value
    }

    companion object {

        @JvmField
        val data = ConcurrentHashMap<UUID, PlayerData>()

        fun getData(player: Player): PlayerData {
            return data.computeIfAbsent(player.uniqueId) {
                PlayerData(player)
            }
        }

        fun removeData(player: Player) {
            data -= player.uniqueId
        }

    }

}