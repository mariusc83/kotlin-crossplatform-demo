package com.contentsquare.utils.encode

actual object EncoderFactory {
    actual fun encoder(): Base64Encoder {
        return JSBase64Encoder()
    }
}

class JSBase64Encoder : Base64Encoder {
    override fun encode(byteArray: ByteArray): ByteArray {
        val buffer = js("Buffer").from(byteArray)
        val encodedString = buffer.toString("Base64") as String
        return ByteArray(encodedString.length) { encodedString[it].toByte() }
    }
}