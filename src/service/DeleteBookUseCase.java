package service;

import model.Book;

import java.util.List;

public class DeleteBookUseCase {

    public void deleteBook(List<Book> bookList, int bookId) {
        try {
            deleteCorrectBook(bookList, bookId);
            setNewIdInHigherId(bookList, bookId);
        } catch (Exception ex) {
            System.out.println("Ksiażka o takim indeksie nie istnieje");
        }
    }

    private static void setNewIdInHigherId(List<Book> bookList, int bookId) {
        for(int i = bookList.size(); i> bookId; i++){
            bookList.get(i-1).setId(i-1);
        }
    }

    private static void deleteCorrectBook(List<Book> bookList, int bookId) {
        for (Book book : bookList) {
            if (book.getId() == bookId) {
                bookList.remove(book);
            }
        }
    }

}
