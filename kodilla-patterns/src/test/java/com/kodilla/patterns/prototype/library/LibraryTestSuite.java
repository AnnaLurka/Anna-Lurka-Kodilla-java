package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("My library");
        Book book1 = new Book("Robinson Crusoe", "Daniel Defoe", LocalDate.of(1719, 01, 01));
        Book book2 = new Book("Dżuma", "Albert Camus", LocalDate.of(1947, 01, 01));
        Book book3 = new Book("Dlatego żyjemy", "Wisława Szymborka", LocalDate.of(1952, 01, 01));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Your shallow library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Your deep library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
