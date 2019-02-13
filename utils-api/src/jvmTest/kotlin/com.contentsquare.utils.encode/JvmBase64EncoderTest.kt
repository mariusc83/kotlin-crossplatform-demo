package com.contentsquare.utils.encode

import kotlin.test.Test
import kotlin.test.assertEquals

class JvmBase64EncoderTest {

    @Test
    fun testEncoding() {
        val encoder = JVMBase64Encoder()
        val toEncode = "John"
        val encoded = encoder.encodeToString(toEncode.toByteArray())
        assertEquals("Sm9obg==", encoded)
    }
}