package learn.something.iterator.iterator;

import learn.something.iterator.Book;
import learn.something.iterator.aggretator.BookShelf;

import java.util.Iterator;

/**
 * Concrete Iterator implementation
 *
 * Iterator Role - java.util.Iterator
 */
public class BookIterator implements Iterator<Book> {

    private BookShelf bookShelf;

    private int index = 0;

    public BookIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.length();
    }

    @Override
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
