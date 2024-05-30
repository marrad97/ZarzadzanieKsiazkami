import model.Book;
import service.*;
import view.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> books = initBooksAndShowAll();

        ShowBooksUseCase showBooksUseCase = new ShowBooksUseCase();
        DeleteBookUseCase deleteBookUseCase = new DeleteBookUseCase();
        CreateBookUseCase createBookUseCase = new CreateBookUseCase();
        FilterBooksUseCase filterBooksUseCase = new FilterBooksUseCase();
        SortBooksUseCase sortBooksUseCase = new SortBooksUseCase();

        ShowBooksView showBooksView = new ShowBooksView(showBooksUseCase);
        DeleteBookView deleteBookView = new DeleteBookView(showBooksView,deleteBookUseCase);
        CreateBookView createBookView = new CreateBookView(showBooksView,createBookUseCase);
        SortBooksView sortBooksView = new SortBooksView(showBooksView,sortBooksUseCase);
        FilterBooksView filterBooksView = new FilterBooksView(showBooksView,filterBooksUseCase);

        MainView mainView = new MainView(showBooksView,deleteBookView,createBookView,sortBooksView,filterBooksView);

        mainView.showMainPanel(books);

    }

    private static List<Book> initBooksAndShowAll() {
        List<Book> bookStore = new ArrayList<>();

        bookStore.add(new Book(1, "Buszujący w zbożu", "J.D. Salinger", 1951, "Fikcja"));
        bookStore.add(new Book(2, "Zabić drozda", "Harper Lee", 1960, "Fikcja"));
        bookStore.add(new Book(3, "1984", "George Orwell", 1949, "Dystopia"));
        bookStore.add(new Book(4, "Moby Dick", "Herman Melville", 1851, "Przygoda"));
        bookStore.add(new Book(5, "Duma i uprzedzenie", "Jane Austen", 1813, "Romans"));
        bookStore.add(new Book(6, "Wojna i pokój", "Lew Tołstoj", 1869, "Historyczna"));
        bookStore.add(new Book(7, "Zbrodnia i kara", "Fiodor Dostojewski", 1866, "Psychologiczna"));
        bookStore.add(new Book(8, "Wielki Gatsby", "F. Scott Fitzgerald", 1925, "Fikcja"));
        bookStore.add(new Book(9, "Nowy wspaniały świat", "Aldous Huxley", 1932, "Dystopia"));
        bookStore.add(new Book(10, "Hobbit", "J.R.R. Tolkien", 1937, "Fantasy"));
        bookStore.add(new Book(11, "Dziwne losy Jane Eyre", "Charlotte Brontë", 1847, "Romans"));
        bookStore.add(new Book(12, "Wichrowe Wzgórza", "Emily Brontë", 1847, "Romans"));
        bookStore.add(new Book(13, "Bracia Karamazow", "Fiodor Dostojewski", 1880, "Filozoficzna"));
        bookStore.add(new Book(14, "Nędznicy", "Victor Hugo", 1862, "Historyczna"));
        bookStore.add(new Book(15, "Odyseja", "Homer", -800, "Epos"));
        bookStore.add(new Book(16, "Sto lat samotności", "Gabriel García Márquez", 1967, "Magiczny Realizm"));
        bookStore.add(new Book(17, "Anna Karenina", "Lew Tołstoj", 1877, "Realistyczna"));
        bookStore.add(new Book(18, "Boska Komedia", "Dante Alighieri", 1320, "Epos"));
        bookStore.add(new Book(19, "Don Kichot", "Miguel de Cervantes", 1605, "Satyra"));
        bookStore.add(new Book(20, "Ulisses", "James Joyce", 1922, "Modernistyczna"));
        bookStore.add(new Book(21, "Wściekłość i wrzask", "William Faulkner", 1929, "Południowy Gotyk"));
        bookStore.add(new Book(22, "Lolita", "Vladimir Nabokov", 1955, "Powieść"));
        bookStore.add(new Book(23, "W poszukiwaniu straconego czasu", "Marcel Proust", 1913, "Modernistyczna"));
        bookStore.add(new Book(24, "Grona gniewu", "John Steinbeck", 1939, "Fikcja"));
        bookStore.add(new Book(25, "Iliada", "Homer", -750, "Epos"));

        return bookStore;
    }

}