package com.xascar.mykotlinlearning.assingnments

val firstAcceptedDigits = listOf<String>("1111", "1232", "5627", "8121")

/**
 * Validate a credit card
 */
fun main(){
    val cardNumber = "1111-2321-7625-1200"
    println("Card status: ${validateCreditCard(cardNumber)}")
}

/**
 * [validateCreditCard]
 * @cardNumber
 * Output @returns card status.
 *
 */
fun validateCreditCard(cardNumber: String): String{
    return firstAcceptedDigits.contains(cardNumber.split("-").first()).let { containsAcceptedValues ->
        if (!containsAcceptedValues) return "false"
        try {
            val mm = cardNumber.split("-").last().substring(0,2).toInt()
            val yy = cardNumber.split("-").last().substring(2,4).toInt()
            if (!(0..99).contains(yy) or !(1..12).contains(mm)) return "false"
            "true"
        }catch (e: Exception){
            "false"
        }
    }
}