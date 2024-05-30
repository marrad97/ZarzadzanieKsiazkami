package service;

import model.Book;

import java.util.List;

public class CreateBookUseCase {

    public void createBook(List<Book> bookList, String title, String author, int year, String genre){
        int id = bookList.size() + 1;
        Book newBook = new Book(id, title, author,year, genre);
        bookList.add(newBook);
    }

}
