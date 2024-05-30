package view;

import model.Book;
import service.DeleteBookUseCase;

import java.util.List;
import java.util.Scanner;

public class DeleteBookView {

    private final ShowBooksView showBooksView;
    private final DeleteBookUseCase deleteBookUseCase;

    public DeleteBookView(ShowBooksView showBooksView, DeleteBookUseCase deleteBookUseCase) {
        this.showBooksView = showBooksView;
        this.deleteBookUseCase = deleteBookUseCase;
    }


    public void deleteSingleBook(List<Book> bookStore, Scanner scanner) {

        showBooksView.showAllBooks(bookStore);
        System.out.println("Wybierz idenktyfikator ksiązki do usunięcia:");

        int bookId = scanner.nextInt();
        scanner.nextLine();

        deleteBookUseCase.deleteBook(bookStore, bookId);

        showBooksView.showAllBooks(bookStore);

    }

}
