package com.contentsquare.utils.encode


interface Base64Encoder {
    fun encode(byteArray: ByteArray): ByteArray

    fun encodeToString(byteArray: ByteArray): String {
        with(encode(byteArray)) {
            val stringBuilder = StringBuilder()
            forEach {
                stringBuilder.append(it.toChar())
            }
            return stringBuilder.toString()
        }
    }
}

expect object EncoderFactory {
    fun encoder(): Base64Encoder
}