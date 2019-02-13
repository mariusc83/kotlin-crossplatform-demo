package com.contentsquare.syntax

// simple interface - class relation

//interface Foo {
//    fun sayHello()
//}
//
//class Bar:Foo {
//
//    override fun sayHello(){
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//}

// ------------------------------------------------------------------
// unlike Java supports function definition directly in the interface

//interface Foo {
//
//    fun sayHello() {
//        println("Hello World from Foo")
//    }
//}

//class Bar : Foo {
//
//}

//class Bar: Foo {
//    override fun sayHello() {
//        println("Hello World from Bar")
//    }
//}


// ------------------------------------------------------------------
// classes delegates

//interface Foo {
//
//    fun sayHello()
//}
//
//class FooImpl : Foo {
//    override fun sayHello() {
//        println("Hello World")
//    }
//}
//
//class Bar(wrapped: FooImpl) : Foo by wrapped
//
//fun testBar() {
//    val bar = Bar(FooImpl())
//    bar.sayHello()
//}
//


// ---------------------------------------------------------------------
// typealias

//typealias Name = Pair<String, String>
//
//fun testTypeAlias() {
//    val personName: Name = Pair("John", "Doe")
//}


// ---------------------------------------------------------------------
// singleton

//object Utils {
//
//    fun matchStrings(s1: String, s2: String): Boolean {
//        return s1 == s2
//    }
//}
//
//fun testUtils() {
//    Utils.matchStrings("sa", "sad")
//}

