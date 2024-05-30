package view;

import model.Book;
import service.CreateBookService;

import java.util.List;
import java.util.Scanner;

public class CreateBookView {

    private final ShowBooksView showBooksView;
    private final CreateBookService createBookService;

    public CreateBookView(ShowBooksView showBooksView, CreateBookService createBookService) {
        this.showBooksView = showBooksView;
        this.createBookService = createBookService;
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

        createBookService.createBook(bookStore, title, author, year, genre);

        showBooksView.showAllBooks(bookStore);
    }

}
