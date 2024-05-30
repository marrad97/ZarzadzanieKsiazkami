package service;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class FilterBooksUseCase {

    public List<Book> fiterByTitle(List<Book> bookList, String searchWord) {
        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : bookList) {
            if (book.getTitle() != null && searchWord != null && book.getTitle().toLowerCase().contains(searchWord.toLowerCase())) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    public List<Book> fiterByAuthor(List<Book> bookList, String searchWord) {
        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : bookList) {
            if (book.getAuthor() != null && searchWord != null && book.getAuthor().toLowerCase().contains(searchWord.toLowerCase())) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    public List<Book> fiterByYear(List<Book> bookList, String searchYear) {
        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : bookList) {
            if (searchYear != null && String.valueOf(book.getYear()).contains(searchYear)) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    public List<Book> fiterByGenre(List<Book> bookList, String searchWord) {
        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : bookList) {
            if (book.getGenre() != null && searchWord != null && book.getGenre().toLowerCase().contains(searchWord.toLowerCase())) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

}
