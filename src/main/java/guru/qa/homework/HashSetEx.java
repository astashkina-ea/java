package guru.qa.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

    public static void main(String[] args) {

        Book2 book1 = new Book2();
        HashSet<Book2> books = new HashSet<Book2>();
        Book2 book2 = new Book2();
        Book2 book3 = new Book2();
        Book2 book4 = new Book2();

        book1.setAuthor("Пушкин");
        book1.setTitle("Евгений Онегин");
        book2.setAuthor("Лермонтов");
        book2.setTitle("Мцыри");
        book3.setAuthor("Толстой");
        book3.setTitle("Война и мир");
        book4.setAuthor("Лермонтов");
        book4.setTitle("Герой нашего времени");

        System.out.println("Добавили книги");
        Book2.addBook(books, book1);
        Book2.addBook(books, book2);
        Book2.addBook(books, book3);
        Book2.addBook(books, book3);
        Book2.addBook(books, book4);
        Book2.printBooks(books);

        System.out.println("Поиск книги");
        Book2.searchBookByTitleOrAuthor(books, "Лермонтов");

        System.out.println("Удалили книгу");
        Book2.deleteBook(books, book2);
        Book2.printBooks(books);
    }
}

class Book2 {

    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void addBook(HashSet<Book2> books, Book2 book) {
        books.add(book);
    }

    public static void searchBookByTitleOrAuthor(HashSet<Book2> books, String search) {
        Book2 book = null;
        Iterator<Book2> iter = books.iterator();
        int count = 0;

        do {
            book = iter.next();
            if (book.getAuthor().equals(search) || book.getTitle().equals(search)) {
                count++;
                System.out.println("Книга " + count + " найдена");
                printBook(book);
            }
        } while (iter.hasNext());

        if (count == 0) {
            System.out.println("Книга не найдена");
        }
    }

    public static void deleteBook(HashSet<Book2> books, Book2 book) {
        books.remove(book);
    }


    public static void printBooks(HashSet<Book2> books) {
        for (Book2 book : books) {
            printBook(book);
        }
    }

    public static void printBook(Book2 book) {
        System.out.println("Название: " + book.getTitle() + " - Автор: " + book.getAuthor());

    }
}
