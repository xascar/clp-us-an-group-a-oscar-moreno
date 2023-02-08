package com.xascar.mykotlinlearning.nullsafety

/**
 * Converts any value to a non-null type and throws an exception if the value is null
 */
fun main(){
    val b: String? = null

    safeCast()
    //val l: Int = if (b != null) b.length else -1  -- Instead of this, use:
    val l = b!!.length // throws an exception since b is null
    println(l) // Never executed



}

/**
 * Regular casts may result in a ClassCastException if the object is not of the target type.
 * Another option is to use safe casts that return null if the attempt was not successful
 */
fun safeCast(){
    val a = "Kotlin"
    val aInt: Int? = a as? Int //the attempt was not successful thus, print null
    println(aInt)
}