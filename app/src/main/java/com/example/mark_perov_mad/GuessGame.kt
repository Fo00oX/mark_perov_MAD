package com.example.mark_perov_mad

fun generateSecretNumber(): String {
    val digits = mutableListOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')
    digits.shuffle()
    return digits.subList(0, 4).joinToString("")
}

fun getGuessFromUser(): String {
    var guess: String?
    do {
        println("Please enter a 4-digit number:")
        guess = readLine()
    } while ((guess == null) || (guess.length != 4))
    return guess
}

fun countRightNumbers(secretNumber: String, guess: String?): Int {
    var count = 0
    if (guess != null) {
        for (digit in guess.toSet()) {
            if (secretNumber.contains(digit)) {
                count++
            }
        }
    }
    return count
}

fun countRightPositions(secretNumber: String, guess: String?): Int {
    var count = 0
    if (guess != null) {
        for (i in secretNumber.indices) {
            if (secretNumber[i] == guess[i]) {
                count++
            }
        }
    }
    return count
}