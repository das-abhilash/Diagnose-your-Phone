package com.zollet.diagnoseyourapp.models

import android.graphics.drawable.Drawable
import java.util.*

class App(
    val name: String,
    val path: String,
    val packageName: String,
    val icon: Drawable,
    val isSystemApp: Boolean,
    val installedDate: Date,
    val isChineseApp: Boolean,
    val alternatives: List<AlternativeApp>
) {
    var isVisible: Boolean = false

    init {
        this.isVisible = true
    }
}
