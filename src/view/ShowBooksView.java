package view;

import model.Book;
import service.ShowBooksUseCase;

import java.util.List;

public class ShowBooksView {

    private final ShowBooksUseCase showBooksUseCase;

    public ShowBooksView(ShowBooksUseCase showBooksUseCase) {
        this.showBooksUseCase = showBooksUseCase;
    }

    void showAllBooks(List<Book> bookStore) {
        System.out.println();
        System.out.println("identyfikator : tytuł : autor : rok wydania : gatunek");
        showBooksUseCase.showBooks(bookStore);
        System.out.println("\n \n");
    }

}
