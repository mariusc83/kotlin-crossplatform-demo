package com.contentsquare.utils.encode

import kotlin.test.Test
import kotlin.test.assertEquals

class Base64EncoderTest {
    // will perform the test for all targets (in our case for JVM and JS)
    @Test
    fun testBase64Encoder() {
        val encoder = EncoderFactory.encoder()
        val toEncode = "John"
        val encoded = encoder.encodeToString(toEncode.toByteArray())
        assertEquals("Sm9obg==", encoded)
    }

    fun String.toByteArray(): ByteArray {
        return ByteArray(length) {
            this[it].toByte()
        }
    }
}