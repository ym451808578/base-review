package org.example.pattern.iterator;

/**
 * @author Castle
 * @Date 2021/5/24 14:49
 */
public class BookAggregate implements IAggregate {

    private Book[] books;
    private int last = 0;

    public BookAggregate(int maxSize) {
        this.books = new Book[maxSize];
    }

    public void addBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    public Book getAt(int index) {
        return books[index];
    }

    @Override
    public IIterator iterator() {
        return new BookAggregateIterator(this);
    }
}
