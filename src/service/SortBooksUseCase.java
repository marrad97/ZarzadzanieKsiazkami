package service;

import model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBooksUseCase {

    public List<Book> sortByTitleAsc(List<Book> bookList) {
        List<Book> sortedList = new ArrayList<>(bookList);

        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareTo(b2.getTitle());
            }
        });
        return sortedList;
    }

    public List<Book> sortByTitleDesc(List<Book> bookList) {
        List<Book> sortedList = new ArrayList<>(bookList);

        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b2.getTitle().compareTo(b1.getTitle());
            }
        });
        return sortedList;
    }

    public List<Book> sortByAuthorAsc(List<Book> bookList) {
        List<Book> sortedList = new ArrayList<>(bookList);

        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getAuthor().compareTo(b2.getAuthor());
            }
        });
        return sortedList;
    }

    public List<Book> sortByAuthorDesc(List<Book> bookList) {
        List<Book> sortedList = new ArrayList<>(bookList);

        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b2.getAuthor().compareTo(b1.getAuthor());
            }
        });
        return sortedList;
    }

    public List<Book> sortByYearAsc(List<Book> bookList) {
        List<Book> sortedList = new ArrayList<>(bookList);

        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b2.getYear(), b1.getYear());
            }
        });
        return sortedList;
    }

    public List<Book> sortByYearDesc(List<Book> bookList) {
        List<Book> sortedList = new ArrayList<>(bookList);

        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.getYear(), b2.getYear());
            }
        });
        return sortedList;
    }

    public List<Book> sortByGenreAsc(List<Book> bookList) {
        List<Book> sortedList = new ArrayList<>(bookList);

        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getGenre().compareTo(b2.getGenre());
            }
        });
        return sortedList;
    }

    public List<Book> sortByGenreDesc(List<Book> bookList) {
        List<Book> sortedList = new ArrayList<>(bookList);

        Collections.sort(sortedList, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b2.getGenre().compareTo(b1.getGenre());
            }
        });
        return sortedList;
    }

}
