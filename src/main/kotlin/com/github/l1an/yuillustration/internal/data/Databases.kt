package com.github.l1an.yuillustration.internal.data

import com.github.l1an.yuillustration.api.event.CustomDatabaseEvent
import com.github.l1an.yuillustration.internal.config.Config
import taboolib.common.LifeCycle
import taboolib.common.platform.Awake
import taboolib.expansion.playerDatabase
import taboolib.expansion.setupPlayerDatabase

object Databases {

    @Awake(LifeCycle.ENABLE)
    fun init() {
        when (val type = Config.config.getString("Database.Method")?.uppercase()) {
            "LOCAL", "SQLITE", null -> setupPlayerDatabase()
            "SQL", "MYSQL" -> setupPlayerDatabase(
                Config.config.getConfigurationSection("Database.SQL")!!,
                Config.config.getString("Database.SQL.table")!!
            )
            else -> {
                val event = CustomDatabaseEvent(type)
                event.call()
                playerDatabase = event.database ?: error("Unsupported database type: $type")
            }
        }
    }
}