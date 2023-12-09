package com.github.l1an.yuillustration.util

import com.github.l1an.yuillustration.internal.data.PlayerData
import org.bukkit.entity.Player

inline val Player.data get() = PlayerData.getData(this)