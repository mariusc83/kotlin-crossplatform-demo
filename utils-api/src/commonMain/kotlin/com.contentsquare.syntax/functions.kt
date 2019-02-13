package com.contentsquare.syntax

// Almost static functions :)

//class Bar {
//
//    companion object {
//        fun sayHello() {
//            TODO()
//        }
//    }
//}
//
//fun testBar() {
//    Bar.sayHello()
//}


// file functions. Can be accessed from anywhere inside the project

//fun helloWorld() {
//    TODO()
//}


// extension - inlined function

//inline fun String.decorateCharacter(decorator: (Char) -> CharArray): String {
//    val stringBuilder = StringBuilder()
//    forEach {
//        stringBuilder.append(decorator(it))
//    }
//
//    return stringBuilder.toString()
//}
//
//fun testExtension() {
//    val name = "John"
//    name.decorateCharacter { charArrayOf(it, '*') }
//}