package com.xascar.mykotlinlearning.nullsafety

/**
 * This returns b.length if b is not null, and null otherwise. The type of this expression is Int?.
 */
fun main(){
    println("Safety calling over nullable values")
    val a = "Kotlin"
    val b: String? = null
    println(b?.length)
    println(a?.length) // Unnecessary safe call because is not nullable

    println("\nRetrieving only not null values in an array")
    val listWithNulls: List<String?> = listOf("Oscar",null,"Moreno", null,null,".")
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }
}