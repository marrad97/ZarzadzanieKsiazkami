package view;

import model.Book;
import service.SortBooksService;

import java.util.List;
import java.util.Scanner;

public class SortBooksView {

    private final ShowBooksView showBooksView;
    private final SortBooksService sortBooksService;

    public SortBooksView(ShowBooksView showBooksView, SortBooksService sortBooksService) {
        this.showBooksView = showBooksView;
        this.sortBooksService = sortBooksService;
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
                showBooksView.showAllBooks(sortBooksService.sortByTitleDesc(bookStore));
                break;
            case 2:
                showBooksView.showAllBooks(sortBooksService.sortByTitleAsc(bookStore));
                break;
            case 3:
                showBooksView.showAllBooks(sortBooksService.sortByAuthorDesc(bookStore));
                break;
            case 4:
                showBooksView.showAllBooks(sortBooksService.sortByAuthorAsc(bookStore));
                break;
            case 5:
                showBooksView.showAllBooks(sortBooksService.sortByYearAsc(bookStore));
                break;
            case 6:
                showBooksView.showAllBooks(sortBooksService.sortByYearDesc(bookStore));
                break;
            case 7:
                showBooksView.showAllBooks(sortBooksService.sortByGenreDesc(bookStore));
                break;
            case 8:
                showBooksView.showAllBooks(sortBooksService.sortByGenreAsc(bookStore));
                break;
            case 0:
                System.out.println("Wyjście z sortowania.");
                break;
            default:
                System.out.println("Nieprawidłowy wybór. Proszę wybrać numer od 0 do 8.");
        }

    }

}
