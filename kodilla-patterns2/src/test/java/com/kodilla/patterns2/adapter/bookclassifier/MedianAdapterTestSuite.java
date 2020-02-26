package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Author1", "Title1", 2001, "001");
        Book book2 = new Book("Author2", "Title2", 2002, "002");
        Book book3 = new Book("Author3", "Title3", 2003, "003");
        Book book4 = new Book("Author4", "Title4", 2004, "004");
        //Book book5 = new Book("Author5", "Title5", 2005, "005");
        Set<Book> librarya = new HashSet<>();
        librarya.add(book1);
        librarya.add(book2);
        librarya.add(book3);
        librarya.add(book4);
        //librarya.add(book5);
        MedianAdapter adapter = new MedianAdapter();
        //When
        int result = adapter.publicationYearMedian(librarya);
        //Then
        System.out.println(result);
        assertEquals(result, 2002.5, 0);
    }
}