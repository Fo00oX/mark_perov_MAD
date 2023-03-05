package com.example.mark_perov_mad

fun main() {
    val secretNumber = generateSecretNumber()
    var guess: String?
    var n: Int
    var m: Int

    println("Welcome to the number guessing game!")
    do {
        guess = getGuessFromUser()
        n = countRightNumbers(secretNumber, guess)
        m = countRightPositions(secretNumber, guess)
        println("User input: $guess, Output: $n:$m")
    } while (n != 4 || m != 4)
}