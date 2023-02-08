package com.xascar.mykotlinlearning.nullsafety

/**
 * If the expression to the left of ?: is not null, the Elvis operator returns it, otherwise it returns the expression to the right.
 */
fun main(){
    val b: String? = null

    //val l: Int = if (b != null) b.length else -1  -- Instead of this, use:
    val l = b?.length ?: -1
    println(l) // returned the default value

}