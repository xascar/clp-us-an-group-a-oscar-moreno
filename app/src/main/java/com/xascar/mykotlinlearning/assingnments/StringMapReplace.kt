package com.xascar.mykotlinlearning.assingnments

/**
 * Replace annotations in a string with the provided map.
 *      Example -> input one: "some random string @test challenge @okay"
 *      Input two: @test is Laptop, @okay is Gone
 *      Output: some random string Laptop challenge Gone
  */
val stringMap: Map<String, String> = mapOf("@test" to "Laptop"
    ,"@okay" to "Gone") //Add extra key-value pairs if needed


fun  main(){
    val inputString = "some random string @test challenge @okay"
    println("Mapped string: ${mapStrings(inputString)}")
}

fun  mapStrings(inputString: String) = inputString.split(" ").map {
    if (stringMap.containsKey(it)){
        stringMap.getValue(it)
    } else{
        it
    }
}.joinToString(" ")