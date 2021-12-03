package ru.net

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class MainKtAdvancedTest(
    private val userType: String,
    private val expectedPrice: Int
) {

    // методы которые будут вызваны перед тестом и после
//    @Before
//    fun setUp() {
//    }
//
//    @After
//    fun tearDown() {
//    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: isValid({0})={1}")
        fun data(): List<Array<out Any>> {
            return arrayListOf(
                arrayOf(NORMAL, 10),
              //  arrayOf(SILVER, 9), // закомментировал чтобы показать вариант когда не все ветки покрыты тестами
             //   arrayOf(GOLD, 9),
                arrayOf("---", 10)
            ).toList()
        }
    }

    @Test
    fun calculateDiscountTest() {
        val price = 10
        // act
        val actualPrice = calculateDiscount(userType, price)
        // assert
        assertEquals(expectedPrice, actualPrice)
    }
}