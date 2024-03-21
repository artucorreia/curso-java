package model.entities;

import model.exception.BookException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public Library() { }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public void rentBook(String title) {
        Book book = findBookByTitle(title);
        if (book == null) {
            throw new BookException("livro \"" + title + "\" não encontrado");
        }
        book.rent();
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}
