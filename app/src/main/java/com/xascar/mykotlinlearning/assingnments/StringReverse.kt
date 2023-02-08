package com.xascar.mykotlinlearning.assingnments

/**
 * App that reverses user input string
 */
fun main(){
    print("Type input string to reverse: ")
    val inputString = readLine().toString()
    println(" Solution 1: ${easyReverse(inputString)}")
    println("Alternative: ${reverseAlternative(inputString)}")
}

fun easyReverse(inputString: String) = inputString.reversed()

fun reverseAlternative(inputString: String) = inputString.toCharArray().reversed().joinToString()