package view;

import model.Book;
import service.ShowBooksService;

import java.util.List;

public class ShowBooksView {

    private final ShowBooksService showBooksService;

    public ShowBooksView(ShowBooksService showBooksService) {
        this.showBooksService = showBooksService;
    }

    void showAllBooks(List<Book> bookStore) {
        System.out.println();
        System.out.println("identyfikator : tytuł : autor : rok wydania : gatunek");
        showBooksService.showBooks(bookStore);
        System.out.println("\n \n");
    }

}
