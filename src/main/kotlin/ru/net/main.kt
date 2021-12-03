package ru.net

import kotlin.math.roundToInt


const val NORMAL = "normal+"
const val SILVER = "silver"
const val GOLD = "gold"


fun main(args: Array<String>) {
    val type = GOLD
    val itemPrice = 100
    val result = calculateDiscount(type, itemPrice)
    print(result)
}


fun calculateDiscount(
    userType: String,
    price: Int = 10
): Int {
    return when (userType) {
        NORMAL -> price
        SILVER -> (price * 0.95).roundToInt()
        GOLD -> (price * 0.9).roundToInt()
        else -> price
    }
}