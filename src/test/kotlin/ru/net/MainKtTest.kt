package ru.net

import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun should_calculate_correct_for_normal_type() {
        // arrange
        val userType = NORMAL
        val price = 10
        val expectedPrice = 10
        // act
        val actualPrice = calculateDiscount(userType, price)
        // assert
        assertEquals(expectedPrice, actualPrice)
    }

    @Test
    fun should_calculate_correct_for_normal_gold() {
        // arrange
        val userType = GOLD
        val price = 100
        val expectedPrice = 90
        // act
        val actualPrice = calculateDiscount(userType, price)
        // assert
        assertEquals(expectedPrice, actualPrice)
    }
}