/*
 * Analytics.kt
 *
 * This file is part of FareBot.
 * Learn more at: https://codebutler.github.io/farebot/
 *
 * Copyright (C) 2017 Eric Butler <eric@codebutler.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.codebutler.farebot.app.core.analytics


enum class AnalyticsEventName(val value: String) {
    SCAN_CARD("Scan Card"),
    SCAN_CARD_ERROR("Scan Card Error"),
    VIEW_CARD("View Card"),
    VIEW_SCREEN("View Screen"),
    VIEW_TRANSIT("View Transit"),
}

fun logAnalyticsEvent(name: AnalyticsEventName, type: String) {
//    Answers.getInstance().logCustom(CustomEvent(name.value)
//            .putCustomAttribute("Type", type))
}
