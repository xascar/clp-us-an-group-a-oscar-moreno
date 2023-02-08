package com.xascar.mykotlinlearning

/*
* Higher Order Function / Lambda Function -> using function as a parameter or return type
* */
fun main() {

    val callFun = {
        println("Hey, I am from Lambda Fun!")
    } //Lambda

    println(callFun())  // higher order function

    var addFun = { a: Int, b: Int ->
        a + b
    }
    println(addFun(2, 3))
    //Override variable
    addFun = { a: Int, b: Int ->
        a - b
    }

    println(addFun(2, 3))

}