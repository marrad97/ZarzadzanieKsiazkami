package view;

import model.Book;
import service.CreateBookUseCase;

import java.util.List;
import java.util.Scanner;

public class CreateBookView {

    private final ShowBooksView showBooksView;
    private final CreateBookUseCase createBookUseCase;

    public CreateBookView(ShowBooksView showBooksView, CreateBookUseCase createBookUseCase) {
        this.showBooksView = showBooksView;
        this.createBookUseCase = createBookUseCase;
    }

    public void createSingleBook(List<Book> bookStore, Scanner scanner) {

        System.out.println("\n \n");

        System.out.println("Podaj tytuł książki:");
        String title = scanner.nextLine();

        System.out.println("Podaj autora książki:");
        String author = scanner.nextLine();

        System.out.println("Podaj rok wydania książki:");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj gatunek książki:");
        String genre = scanner.nextLine();

        createBookUseCase.createBook(bookStore, title, author, year, genre);

        showBooksView.showAllBooks(bookStore);
    }

}
