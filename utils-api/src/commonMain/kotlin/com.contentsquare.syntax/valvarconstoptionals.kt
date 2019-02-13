package com.contentsquare.syntax

import kotlin.random.Random

//fun valVar(){
//    val firstName = "John"
//    var secondName = "Doe"
//    secondName = "Snow"
//    firstName = "Snow"
//}


// constVal

//class ConstVal {
//
//    companion object {
//        const val secondName: String = "Doe" // needs to be allocated at compile time. Needs to leave in the static
//        // block of the class
//    }
//
//
//    val firstName: String
//
//    init {
//        firstName = "John" // constant but can be allocated at runtime
//    }
//
//
//}


// optionals

//fun getFirstName(): String {
//    return "John"
//}
//
//fun getLastName(): String? {
//    return if (Random(13).nextInt(1) < 0.5) "Doe" else null
//}
//
//fun getNameLength(): Int {
//    return getFirstName().length + getLastName()?.length
//}