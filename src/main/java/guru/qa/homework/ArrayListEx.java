package guru.qa.homework;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {

        Book book1 = new Book();
        ArrayList<Book> books = new ArrayList<Book>();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();

        book1.setAuthor("Пушкин");
        book1.setTitle("Евгений Онегин");
        book2.setAuthor("Лермонтов");
        book2.setTitle("Мцыри");
        book3.setAuthor("Толстой");
        book3.setTitle("Война и мир");
        book4.setAuthor("Лермонтов");
        book4.setTitle("Герой нрашего времени");

        System.out.println("Добавили книги");
        Book.addBook(books, book1);
        Book.addBook(books, book2);
        Book.addBook(books, book3);
        Book.addBook(books, book4);
        Book.printBooks(books);

        System.out.println("Поиск книги");
        Book.searchBookByTitleOrAuthor(books, "Лермонтов");

        System.out.println("Удалили книгу");
        Book.deleteBook(books, book2);
        Book.printBooks(books);
    }
}

class Book {

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

    public static void addBook(ArrayList<Book> books, Book book) {
        books.add(book);
    }

    public static void searchBookByTitleOrAuthor(ArrayList<Book> books, String search) {
        int i = 0;
        int count = 0;
        while (i < books.size()) {
            Book book = books.get(i);
            if (book.getTitle().equals(search) || book.getAuthor().equals(search)) {
                count++;
                System.out.println("Книга " + count + " найдена");
                printBook(book);
            }
            i++;
        }
        if (i == books.size() && count == 0) {
            System.out.println("Книга не найдена");
        }
    }

    public static void deleteBook(ArrayList<Book> books, Book book) {
        books.remove(book);
    }


    public static void printBooks(ArrayList<Book> books) {
        for (Book book : books) {
            printBook(book);
        }
    }

    public static void printBook(Book book) {
        System.out.println("Название: " + book.getTitle() + " - Автор: " + book.getAuthor());

    }
}