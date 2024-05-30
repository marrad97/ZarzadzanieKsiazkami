package view;

import model.Book;
import service.SortBooksUseCase;

import java.util.List;
import java.util.Scanner;

public class SortBooksView {

    private final ShowBooksView showBooksView;
    private final SortBooksUseCase sortBooksUseCase;

    public SortBooksView(ShowBooksView showBooksView, SortBooksUseCase sortBooksUseCase) {
        this.showBooksView = showBooksView;
        this.sortBooksUseCase = sortBooksUseCase;
    }

    public void sortBooks(List<Book> bookStore, Scanner scanner) {

        System.out.println("Wpisz numer akcji ktorą chcesz wykonać aby posortować listę :");
        System.out.println("1. Sortuj po tytule malejąco (Z-A)");
        System.out.println("2. Sortuj po tytule rosnąco (A-Z)");
        System.out.println("3. Sortuj po autorze malejąco (Z-A)");
        System.out.println("4. Sortuj po autorze rosnąco (A-Z)");
        System.out.println("5. Sortuj po roku wydania malejąco");
        System.out.println("6. Sortuj po roku wydania rosnąco");
        System.out.println("7. Sortuj po gatunku malejąco (Z-A)");
        System.out.println("8. Sortuj po gatunku rosnąco (A-Z)");
        System.out.println("0. Wyjdź");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                showBooksView.showAllBooks(sortBooksUseCase.sortByTitleDesc(bookStore));
                break;
            case 2:
                showBooksView.showAllBooks(sortBooksUseCase.sortByTitleAsc(bookStore));
                break;
            case 3:
                showBooksView.showAllBooks(sortBooksUseCase.sortByAuthorDesc(bookStore));
                break;
            case 4:
                showBooksView.showAllBooks(sortBooksUseCase.sortByAuthorAsc(bookStore));
                break;
            case 5:
                showBooksView.showAllBooks(sortBooksUseCase.sortByYearAsc(bookStore));
                break;
            case 6:
                showBooksView.showAllBooks(sortBooksUseCase.sortByYearDesc(bookStore));
                break;
            case 7:
                showBooksView.showAllBooks(sortBooksUseCase.sortByGenreDesc(bookStore));
                break;
            case 8:
                showBooksView.showAllBooks(sortBooksUseCase.sortByGenreAsc(bookStore));
                break;
            case 0:
                System.out.println("Wyjście z sortowania.");
                break;
            default:
                System.out.println("Nieprawidłowy wybór. Proszę wybrać numer od 0 do 8.");
        }

    }

}
