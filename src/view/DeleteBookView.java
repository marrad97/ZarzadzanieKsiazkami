package view;

import model.Book;
import service.DeleteBookService;

import java.util.List;
import java.util.Scanner;

public class DeleteBookView {

    private final ShowBooksView showBooksView;
    private final DeleteBookService deleteBookService;

    public DeleteBookView(ShowBooksView showBooksView, DeleteBookService deleteBookService) {
        this.showBooksView = showBooksView;
        this.deleteBookService = deleteBookService;
    }


    public void deleteSingleBook(List<Book> bookStore, Scanner scanner) {

        showBooksView.showAllBooks(bookStore);
        System.out.println("Wybierz idenktyfikator ksiązki do usunięcia:");

        int bookId = scanner.nextInt();
        scanner.nextLine();

        deleteBookService.deleteBook(bookStore, bookId);

        showBooksView.showAllBooks(bookStore);

    }

}
