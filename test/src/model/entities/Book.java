package model.entities;

import model.exception.BookException;
import model.enums.Status;

public class Book {
    private String title;
    private String writer;
    private Status status;

    public Book() { }

    public Book(String title, String writer, Status status) {
        this.title = title;
        this.writer = writer;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public Status getStatus() {
        return status;
    }

    private void setStatus(Status status) {
        this.status = status;
    }

    public void rent() {
        if (status != Status.AVAILABLE) {
            throw new BookException("\"" + getTitle() + "\" se encontra indisponível");
        }
        setStatus(Status.LENT);
    }

    @Override
    public String toString() {
        return "Title: " +
                getTitle() +
                ", Writer: " +
                getWriter() +
                ", Status: " +
                getStatus();
    }
}
