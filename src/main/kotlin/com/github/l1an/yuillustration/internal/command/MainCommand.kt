package com.github.l1an.yuillustration.internal.command

import com.github.l1an.yuillustration.internal.command.subcommand.CommandReload
import taboolib.common.platform.command.CommandBody
import taboolib.common.platform.command.CommandHeader
import taboolib.common.platform.command.mainCommand
import taboolib.expansion.createHelper

@CommandHeader(name = "yuillustration", aliases = ["yui", "illustration", "yil"])
object MainCommand {

    @CommandBody
    val main = mainCommand {
        createHelper()
    }

    @CommandBody
    val reload = CommandReload

}