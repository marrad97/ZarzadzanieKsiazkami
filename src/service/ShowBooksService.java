package service;

import model.Book;

import java.util.List;

public class ShowBooksService {

    public void showBooks(List<Book> bookList){
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

}
