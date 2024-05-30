package view;

import model.Book;
import service.FilterBooksUseCase;

import java.util.List;
import java.util.Scanner;

public class FilterBooksView {

    private final ShowBooksView showBooksView;
    private final FilterBooksUseCase filterBooksUseCase;

    public FilterBooksView(ShowBooksView showBooksView, FilterBooksUseCase filterBooksUseCase) {
        this.showBooksView = showBooksView;
        this.filterBooksUseCase = filterBooksUseCase;
    }

    public void filterBooks(List<Book> bookStore, Scanner scanner) {

        System.out.println("Wpisz numer akcji którą chcesz wykonać a nastepnie wpisz tekst do filtrowania:");
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
                showFilteredBook(filterBooksUseCase.fiterByTitle(bookStore,title));
                break;
            case 2:
                System.out.println("Wpisz autora:");
                String author = scanner.nextLine();
                showFilteredBook(filterBooksUseCase.fiterByAuthor(bookStore,author));
                break;
            case 3:
                System.out.println("Wpisz rok wydania:");
                String year = scanner.nextLine();
                showFilteredBook(filterBooksUseCase.fiterByYear(bookStore,year));
                break;
            case 4:
                System.out.println("Wpisz rok gatunek:");
                String genre = scanner.nextLine();
                showFilteredBook(filterBooksUseCase.fiterByGenre(bookStore,genre));
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
