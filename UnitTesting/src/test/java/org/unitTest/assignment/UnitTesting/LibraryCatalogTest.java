package org.unitTest.assignment.UnitTesting;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryCatalogTest {

    @Test
    public void testAddBooksWithSameTitleAndAuthor() {
        LibraryCatalog catalog = new LibraryCatalog();
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger");

        // Test case: Add books with the same title and author
        catalog.addBook(book1);
        catalog.addBook(book2);
        List<Book> books = catalog.getBooks();
        assertEquals(2, books.size());
        assertTrue(books.contains(book1));
        assertTrue(books.contains(book2));
    }

    @Test
    public void testBorrowAndReturnMultipleBooks() {
        LibraryCatalog catalog = new LibraryCatalog();
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling");
        catalog.addBook(book1);
        catalog.addBook(book2);

        // Test case: Borrow and return multiple books
        catalog.borrowBook("Harry Potter and the Sorcerer's Stone");
        catalog.borrowBook("Harry Potter and the Chamber of Secrets");
        assertFalse(book1.isAvailable());
        assertFalse(book2.isAvailable());

        catalog.returnBook("Harry Potter and the Sorcerer's Stone");
        assertTrue(book1.isAvailable());

        catalog.returnBook("Harry Potter and the Chamber of Secrets");
        assertTrue(book2.isAvailable());
    }

    @Test
    public void testGetBooksAfterReturningAllBooks() {
        LibraryCatalog catalog = new LibraryCatalog();
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien");
        catalog.addBook(book1);
        catalog.addBook(book2);

        // Test case: Get the list of books after returning all books
        catalog.borrowBook("The Lord of the Rings");
        catalog.borrowBook("The Hobbit");
        catalog.returnBook("The Lord of the Rings");
        catalog.returnBook("The Hobbit");

        List<Book> books = catalog.getBooks();
        assertEquals(2, books.size());
        assertTrue(books.get(0).isAvailable());
        assertTrue(books.get(1).isAvailable());
    }
}
