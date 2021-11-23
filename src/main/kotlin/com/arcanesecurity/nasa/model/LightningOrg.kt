package com.arcanesecurity.nasa.model

data class LightningOrg(
    val time : Long,
    val strokes : List<StrokeOrg>
)

data class StrokeOrg (
    val time : Long,
    val lat : Double,
    val lon : Double,
    var power : Int
)
{
    companion object {
        fun generatePower() : Int = (1..1000).random()
    }

}

