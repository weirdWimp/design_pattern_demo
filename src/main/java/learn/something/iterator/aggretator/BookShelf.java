package learn.something.iterator.aggretator;

import learn.something.iterator.Book;
import learn.something.iterator.iterator.BookIterator;

import java.util.*;

/**
 * Concrete Aggregate Role. It's a collection object that contains elements
 * and will create a concrete Iterator implementation.
 * <p>
 * Aggregate Role - java.util.Iterable
 */
public class BookShelf implements Iterable<Book> {

    private List<Book> books;

    public BookShelf(int initMaxSize) {
        books = new ArrayList<>(initMaxSize);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public int length() {
        return books.size();
    }

    /**
     * 匿名类是特殊的局部类，可以访问外部类的任何成员
     *
     */
    public Iterator<Book> localClass2Iterator() {
        return new Iterator<Book>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < length();
            }

            @Override
            public Book next() {
                Book book = getBookAt(index);
                index++;
                return book;
            }
        };
    }

    /**
     * 匿名类是没有名称的类，无法定义构造方法，使用类初始化代码块来替代构造方法
     */
    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(this);
    }

    public Iterator<Book> localClassIterator() {
        return new Iterator<Book>() {
            private List<Book> bookList;
            private int index;

            {
                bookList = books;
                index = 0;
            }

            @Override
            public boolean hasNext() {
                return index < bookList.size();
            }

            @Override
            public Book next() {
                Book book = bookList.get(index);
                index++;
                return book;
            }
        };
    }
}
