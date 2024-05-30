package service;

import model.Book;

import java.util.List;

public class ShowBooksUseCase {

    public void showBooks(List<Book> bookList){
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

}
