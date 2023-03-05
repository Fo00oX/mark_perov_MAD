package com.example.mark_perov_mad

import org.junit.Assert.assertEquals
import org.junit.Test

class GuessGameTest {

    private var secretNumber: String = "8576"

    @Test
    fun `generateSecretNumber returns a 4-digit string with no repeated digits`() {
        val uniqueDigits = secretNumber.toSet()
        assertEquals(4, secretNumber.length)
        assertEquals(4, uniqueDigits.size)
    }

    @Test
    fun `countRightNumbers returns the correct count`() {
        assertEquals(0, countRightNumbers(secretNumber, "1234"))
        assertEquals(4, countRightNumbers(secretNumber, "5678"))
        assertEquals(1, countRightNumbers(secretNumber, "5555"))
        assertEquals(3, countRightNumbers(secretNumber, "3586"))
    }

    @Test
    fun `countRightPositions returns the correct count`() {
        assertEquals(0, countRightPositions(secretNumber, "1234"))
        assertEquals(1, countRightPositions(secretNumber, "5678"))
        assertEquals(1, countRightPositions(secretNumber, "5555"))
        assertEquals(2, countRightPositions(secretNumber, "3586"))
    }
}
