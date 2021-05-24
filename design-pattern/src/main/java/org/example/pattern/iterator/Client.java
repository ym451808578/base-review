package org.example.pattern.iterator;

/**
 * @author Castle
 * @Date 2021/5/24 15:03
 */
public class Client {
    public static void main(String[] args) {
        BookAggregate bookAggregate = new BookAggregate(4);
        Book book1 = new Book("钢铁是怎样炼成的", "保尔");
        Book book2 = new Book("基督山伯爵", "大仲马");
        Book book3 = new Book("三体", "刘慈欣");
        Book book4 = new Book("JAVA核心", "java");
        bookAggregate.addBook(book1);
        bookAggregate.addBook(book2);
        bookAggregate.addBook(book3);
        bookAggregate.addBook(book4);
        IIterator iterator = bookAggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
