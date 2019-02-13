package com.contentsquare.demojs

import com.contentsquare.logger.i
import kotlin.browser.document

fun main(vararg arg: String) {
    i("Main", "main function was called")
    document.addEventListener("DOMContentLoaded", {
        i("Main", "DOMWasLoaded")
    })
}