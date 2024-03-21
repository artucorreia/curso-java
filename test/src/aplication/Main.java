package aplication;

import model.exception.BookException;
import model.entities.Book;
import model.entities.Library;
import model.enums.Status;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        try{
            library.addBook(new Book("Senhor dos Anéis", "J.R.R. Tolkien", Status.AVAILABLE));
            library.addBook(new Book("Dom Casmurro", "Machado de Assis", Status.LENT));
            library.addBook(new Book("1984", "George Orwell", Status.LOST));

            library.rentBook("A Arte da Guerra");
            // output - Erro ao alugar livro: livro "A Arte da Guerra" não encontrado

            library.rentBook("1984"); 
            // output - Erro ao alugar livro: "Dom Casmurro" se encontra indisponível
        }
        catch (BookException e) {
            System.out.println("Erro ao alugar livro: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Erro Inesperado: " + e.getMessage());
        }
    }
}