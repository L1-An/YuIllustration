package com.github.l1an.yuillustration.internal.command.subcommand

import com.github.l1an.yuillustration.api.event.PluginReloadEvent
import com.github.l1an.yuillustration.internal.manager.ConfigManager
import org.bukkit.command.CommandSender
import taboolib.common.platform.command.subCommand
import taboolib.common5.mirrorNow
import taboolib.platform.util.sendLang

val CommandReload = subCommand {
    execute<CommandSender> { sender, _, _ ->
        mirrorNow("Plugin Reload") {
            sender.sendLang("command-reload")
            ConfigManager.reload()
            PluginReloadEvent().call()
        }
    }
}