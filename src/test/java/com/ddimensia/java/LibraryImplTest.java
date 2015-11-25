package com.ddimensia.java;

import com.ddimensia.java.example.ExposedImpl;
import com.ddimensia.java.example.LibraryImpl;
import org.junit.Test;

/**
 *
 */
public class LibraryImplTest {
    @Test
    public void testCallHidden() {
        LibraryImpl library = new LibraryImpl();
        ExposedImpl exposed = new ExposedImpl();
        library.acceptHidden(exposed);
    }

    @Test
    public void testCallExposed() {
        LibraryImpl library = new LibraryImpl();
        ExposedImpl exposed = new ExposedImpl();
        library.acceptsImpl(exposed);
    }
}
