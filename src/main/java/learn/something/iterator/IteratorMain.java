package learn.something.iterator;

import learn.something.iterator.aggretator.BookShelf;

import java.util.Iterator;

public class IteratorMain {

    public static void main(String[] args) {
        final BookShelf bookShelf = new BookShelf(10);
        bookShelf.addBook(new Book(1, "Master SQL"));
        bookShelf.addBook(new Book(2, "Master Java"));
        bookShelf.addBook(new Book(3, "Master PHP"));

        final Iterator<Book> bookIterator = bookShelf.iterator();
        while (bookIterator.hasNext()) {
            System.out.println("bookIterator.next() = " + bookIterator.next());
        }

        /**
         * enhanced for
         * Implementing Iterable interface allows an object to be the
         * target of the "for-each loop" statement.
         */
        for (Book book : bookShelf) {
            System.out.println("book = " + book);
        }

        Book book = new Book(5, "Master Everything") {
            @Override
            public String toString() {
                return "nested type subclass book toString: " + getId() + " " + getName();
            }
        };

        System.out.println("nested type book = " + book);
    }

}
