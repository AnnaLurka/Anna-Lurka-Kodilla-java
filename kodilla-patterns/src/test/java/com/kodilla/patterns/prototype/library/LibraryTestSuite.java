package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks () throws CloneNotSupportedException {
        //Given
        Library library = new Library("My library");
        Book book1 = new Book("Robinson Crusoe", "Daniel Defoe", LocalDate.of(1719, 01, 01));
        Book book2 = new Book("Dżuma", "Albert Camus", LocalDate.of(1947, 01, 01));
        Book book3 = new Book("Dlatego żyjemy", "Wisława Szymborka", LocalDate.of(1952, 01, 01));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowClonedLibrary = null;
        shallowClonedLibrary = library.shallowCopy();
        shallowClonedLibrary.setName("Your shallow library");

        Library deepClonedLibrary = null;
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Your deep library");

        //When
        library.getBooks().add(new Book("Czesław Miłosz", "Wiersze", LocalDate.of(1940, 01, 01)));

        //Then
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
