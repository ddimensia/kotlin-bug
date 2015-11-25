package com.ddimensia.kotlin

import com.ddimensia.java.example.ExposedImpl
import com.ddimensia.java.example.LibraryImpl
import org.junit.Test

/**
 *
 */
class LibraryImplTest {
    @Test
    fun testCallHidden() {
        val library = LibraryImpl()
        val exposed = ExposedImpl()
        library.acceptHidden(exposed)
    }

    @Test
    fun testCallExposed() {
        val library = LibraryImpl()
        val exposed = ExposedImpl()
        library.acceptsImpl(exposed)
    }
}
