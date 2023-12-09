package com.github.l1an.yuillustration.api.event

import taboolib.expansion.Database
import taboolib.platform.type.BukkitProxyEvent

class CustomDatabaseEvent(val name: String, var database: Database? = null) : BukkitProxyEvent() {

    override val allowCancelled: Boolean
        get() = false

}