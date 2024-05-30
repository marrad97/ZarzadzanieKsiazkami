## Instrukcja obsługi

### Wymagania

- Java Development Kit (JDK) w wersji 11 lub wyższej.
- IntelliJ IDEA.

### Uruchomienie aplikacji

1. **Pobierz repozytorium**

    - Sklonuj repozytorium na swój lokalny komputer za pomocą polecenia:
      ```sh
      git clone https://github.com/marrad97/ZarzadzanieKsiazkami.git
      ```
    - Przejdź do katalogu projektu w ktorym sklonowane zostało repozytorium

2. **Rekomendowane uruchomienie projektu**
    
    - Otwórz IntelliJ IDEA.
    - Wybierz opcję `Open` lub `Import Project`.
    - Przejdź do katalogu projektu i wybierz go.
    - IntelliJ IDEA automatycznie wykryje pliki projektu i zaimportuje go.

3. **Kompilacja projektu**

    - IntelliJ IDEA automatycznie skompiluje projekt po jego zaimportowaniu.
    - Jeśli kompilacja nie rozpocznie się automatycznie, możesz ręcznie uruchomić kompilację, wybierając `Build` > `Build Project` z menu.

4. **Uruchomienie aplikacji**
    - W panelu `Project` po lewej stronie, przejdź do katalogu `src`.
    - Znajdź plik `Main.java` i kliknij go prawym przyciskiem myszy.
    - Wybierz opcję `Run 'Main.main()'`.
    - Aplikacja uruchomi się w konsoli w dolnej części okna IntelliJ IDEA.

### Przykładowe użycie

Po uruchomieniu aplikacji użytkownik zobaczy menu z następującymi opcjami:

1. Wyszukaj książki z wykorzystaniem wyrażeń regularnych
2. Sortuj książki według różnych kryteriów
3. Dodaj książkę
4. Usuń książkę
5. Wyświetl informacje o książkach
0. Wyjdź

Użytkownik może wprowadzić odpowiedni numer, aby wybrać akcję do wykonania. Na przykład:

- **Wybór opcji `1`** pozwala na wyszukiwanie książek według wybranego kryterium (tytuł, autor, rok, gatunek) za pomocą wyrażenia regularnego. Użytkownik podaje frazę do filtrowania, a aplikacja wyświetla pasujące książki.

  Po wybraniu tej opcji, użytkownik zostanie poproszony o wybór pola, po którym chce filtrować:

    - Filtrowanie po tytule
    - Filtrowanie po autorze
    - Filtrowanie po roku
    - Filtrowanie po gatunku
    - Wyjście z filtrowania

  Następnie użytkownik podaje wyrażenie regularne, które będzie użyte do filtrowania książek. Aplikacja przeszuka wybrane pole i wyświetli książki, które pasują do podanej frazy.

  Przykład:

    - Użytkownik wybiera opcję `1` z głównego menu.
    - Użytkownik wybiera `1` z opcji filtrowania (Filtrowanie po tytule).
    - Aplikacja prosi o podanie frazy do filtrowania, np. "Buszujący".
    - Aplikacja wyświetla wszystkie książki, których tytuł zawiera frazę "Buszujący".

- **Wybór opcji `2`** umożliwia sortowanie książek według różnych kryteriów. Użytkownik wybiera jedno z poniższych kryteriów, a aplikacja wyświetla posortowaną listę książek:

    - Sortowanie po tytule malejąco (Z-A)
    - Sortowanie po tytule rosnąco (A-Z)
    - Sortowanie po autorze malejąco (Z-A)
    - Sortowanie po autorze rosnąco (A-Z)
    - Sortowanie po roku wydania malejąco
    - Sortowanie po roku wydania rosnąco
    - Sortowanie po gatunku malejąco (Z-A)
    - Sortowanie po gatunku rosnąco (A-Z)
    - Wyjście z sortowania

  Przykład:

    - Użytkownik wybiera opcję `2` z głównego menu.
    - Użytkownik wybiera `1` z opcji sortowania (Sortowanie po tytule malejąco (Z-A)).
    - Aplikacja sortuje książki według tytułu w porządku malejącym i wyświetla posortowaną listę książek.

- **Wybór opcji `3`** pozwala na dodanie nowej książki do kolekcji. Użytkownik zostanie poproszony o podanie szczegółów książki, takich jak tytuł, autor, rok wydania oraz gatunek. Aplikacja następnie dodaje nową książkę do listy i przypisuje jej unikalny identyfikator.

  Przykład:

    - Użytkownik wybiera opcję `3` z głównego menu.
    - Aplikacja prosi o podanie tytułu książki, np. "Nowa Książka".
    - Aplikacja prosi o podanie autora książki, np. "Nowy Autor".
    - Aplikacja prosi o podanie roku wydania, np. "2023".
    - Aplikacja prosi o podanie gatunku, np. "Fantastyka".
    - Aplikacja dodaje nową książkę do listy z podanymi szczegółami i przypisuje jej nowy identyfikator.

- **Wybór opcji `4`** umożliwia usunięcie książki z kolekcji. Użytkownik zostanie poproszony o podanie identyfikatora książki, którą chce usunąć. Aplikacja następnie usuwa książkę z listy i aktualizuje identyfikatory pozostałych książek, aby były unikalne i ciągłe.

  Przykład:

    - Użytkownik wybiera opcję `4` z głównego menu.
    - Aplikacja prosi o podanie identyfikatora książki do usunięcia, np. "3".
    - Aplikacja usuwa książkę o identyfikatorze 3 z listy.
    - Aplikacja aktualizuje identyfikatory pozostałych książek, aby były ciągłe.

- **Wybór opcji `5`** wyświetla listę wszystkich książek znajdujących się w kolekcji. Aplikacja iteruje przez listę książek i wyświetla szczegóły każdej z nich, w tym identyfikator, tytuł, autora, rok wydania oraz gatunek.

  Przykład:

    - Użytkownik wybiera opcję `5` z głównego menu.
    - Aplikacja wyświetla listę wszystkich książek w kolekcji, np.:
      ```
      1 : Buszujący w zbożu : J.D. Salinger : 1951 : Fikcja
      2 : Zabić drozda : Harper Lee : 1960 : Fikcja
      ...
      ```

- **Wybór opcji `0`** kończy działanie programu.

## Autorzy

Projekt został stworzony przez Martyna Radziwonowicz w ramach projektu zaliczeniowego podstawy programowania w języku Java.
