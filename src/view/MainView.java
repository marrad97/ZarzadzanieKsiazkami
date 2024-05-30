package view;

import model.Book;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainView {

    private final ShowBooksView showBooksView;
    private final DeleteBookView deleteBookView;
    private final CreateBookView createBookView;
    private final SortBooksView sortBooksView;
    private final FilterBooksView filterBooksView;

    public MainView(ShowBooksView showBooksView, DeleteBookView deleteBookView, CreateBookView createBookView, SortBooksView sortBooksView, FilterBooksView filterBooksView) {
        this.showBooksView = showBooksView;
        this.deleteBookView = deleteBookView;
        this.createBookView = createBookView;
        this.sortBooksView = sortBooksView;
        this.filterBooksView = filterBooksView;
    }

    public void showMainPanel(List<Book> bookStore) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz opcję:");

            System.out.println("1. Wyszukaj książki z wykorzystaniem wyrażeń regularnych");
            System.out.println("2. Sortuj książki według różnych kryteriów (np. tytuł, autor, rok wydania, gatunek)");
            System.out.println("3. Dodaj książki");
            System.out.println("4. Usuń ksiażki");
            System.out.println("5. Wyświetl informacje o książkach.");
            System.out.println("0. Wyjdź");

            System.out.println("Wpisz numer akcji którą chcesz wykonać:");

            menu(bookStore, scanner);
        }
    }

    private void menu(List<Book> bookStore, Scanner scanner) {
        try{

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    filterBooksView.filterBooks(bookStore, scanner);
                    break;
                case 2:
                    sortBooksView.sortBooks(bookStore, scanner);
                    break;
                case 3:
                    createBookView.createSingleBook(bookStore, scanner);
                    break;
                case 4:
                    deleteBookView.deleteSingleBook(bookStore, scanner);
                    break;
                case 5:
                    showBooksView.showAllBooks(bookStore);
                    break;
                case 0:
                    System.out.println("Wyjście z programu.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Nieprawidłowy wybór. Proszę wybrać numer od 0 do 5.");
            }

        }catch (InputMismatchException ex){
            System.out.println("Nieprawidłowy znak");
            scanner.nextLine();
        }catch (Exception ex){
            System.out.println("Nieoczekiwany błąd aplikacji");
            scanner.nextLine();
        }
    }

}
