package com.contentsquare.utils.encode

import java.util.*

actual object EncoderFactory {
    actual fun encoder(): Base64Encoder {
        return JVMBase64Encoder()
    }
}

class JVMBase64Encoder : Base64Encoder {
    override fun encode(byteArray: ByteArray): ByteArray {
        return Base64.getEncoder().encode(byteArray)
    }
}