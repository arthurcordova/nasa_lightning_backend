package com.arcanesecurity.nasa.model

import java.util.*

data class Lightning(
    val id: String,
    val power: Double,
    val date: Calendar
) {

    companion object {

        fun mock(): Lightning {
            return Lightning(UUID.randomUUID().toString(), (1..999).random().toDouble(), Calendar.getInstance())
        }
    }




}
