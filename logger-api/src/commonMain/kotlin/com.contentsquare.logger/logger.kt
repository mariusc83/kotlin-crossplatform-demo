package com.contentsquare.logger


expect fun i(tag: String, message: String)
expect fun v(tag: String, message: String)
expect fun d(tag: String, message: String)
expect fun e(tag: String, message: String)
expect fun e(tag: String, message: String, exception: Exception)

