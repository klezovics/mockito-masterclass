package com.example.mockitomasterclass

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BasicMockitoUsage {

    class StringProvider {
        fun getString(): String {
            return "abc"
        }
    }

    @Test
    fun testMockBehavesAsExpected() {
        var mock = mock<StringProvider>()
        whenever(mock.getString()).thenReturn("water")
        assertEquals("water", mock.getString())
    }
}
