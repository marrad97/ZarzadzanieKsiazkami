package view;

import model.Book;
import service.FilterBooksService;

import java.util.List;
import java.util.Scanner;

public class FilterBooksView {

    private final ShowBooksView showBooksView;
    private final FilterBooksService filterBooksService;

    public FilterBooksView(ShowBooksView showBooksView, FilterBooksService filterBooksService) {
        this.showBooksView = showBooksView;
        this.filterBooksService = filterBooksService;
    }

    public void filterBooks(List<Book> bookStore, Scanner scanner) {

        System.out.println("Wpisz numer akcji którą chcesz wykonać a następnie wpisz tekst do filtrowania:");
        System.out.println("1. Filtruj po tytule");
        System.out.println("2. Filtruj po autorze");
        System.out.println("3. Filtruj po roku");
        System.out.println("4. Filtruj po gatunku");
        System.out.println("0. Wyjdź");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Wpisz tytuł:");
                String title = scanner.nextLine();
                showFilteredBook(filterBooksService.fiterByTitle(bookStore,title));
                break;
            case 2:
                System.out.println("Wpisz autora:");
                String author = scanner.nextLine();
                showFilteredBook(filterBooksService.fiterByAuthor(bookStore,author));
                break;
            case 3:
                System.out.println("Wpisz rok wydania:");
                String year = scanner.nextLine();
                showFilteredBook(filterBooksService.fiterByYear(bookStore,year));
                break;
            case 4:
                System.out.println("Wpisz rok gatunek:");
                String genre = scanner.nextLine();
                showFilteredBook(filterBooksService.fiterByGenre(bookStore,genre));
                break;
            case 0:
                System.out.println("Wyjście z filtrowania.");
                break;
            default:
                System.out.println("Nieprawidłowy wybór. Proszę wybrać numer od 0 do 4.");
        }

    }

    private void showFilteredBook(List<Book> filteredList){
        if(filteredList.size() == 0){
            System.out.println("nie znaleziono");
        }else{
            showBooksView.showAllBooks(filteredList);
        }
    }

}
