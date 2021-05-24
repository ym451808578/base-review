package org.example.pattern.iterator;

/**
 * @author Castle
 * @Date 2021/5/24 14:50
 */
public class BookAggregateIterator implements IIterator {

    private BookAggregate bookAggregate;

    private int index;

    public BookAggregateIterator(BookAggregate bookAggregate) {
        this.bookAggregate = bookAggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookAggregate.getLength();
    }

    @Override
    public Object next() {
        Book book = bookAggregate.getAt(index);
        index++;
        return book;
    }
}
