package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("BookStore1");

        Book book1 = new Book("title1", "author1", LocalDate.of(2013, 1, 1));
        Book book2 = new Book("title2", "author2", LocalDate.of(2013, 2, 2));
        Book book3 = new Book("title3", "author3", LocalDate.of(2013, 3, 3));
        Book book4 = new Book("title4", "author4", LocalDate.of(2013, 4, 4));
        Book book5 = new Book("title5", "author5", LocalDate.of(2013, 5, 5));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("BookStore2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("BookStore3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, cloneLibrary.getBooks().size());
        Assert.assertEquals(5, deepCloneLibrary.getBooks().size());
        Assert.assertEquals(cloneLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepCloneLibrary.getBooks(), library.getBooks());

    }
}
