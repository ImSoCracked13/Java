import java.util.ArrayList;

// BooksList.java (Renamed from List.java to avoid conflict)
public class BooksList {
    private java.util.List<Books> booksList;

    public BooksList() {
        booksList = new ArrayList<>();
        booksList.add(new Books(1, "My Star Child", "Aka Akasaka", 29.99));
        booksList.add(new Books(2, "Sorcery Fight", "Gege Akutami", 19.99));
        booksList.add(new Books(3, "Demon Slayer", "Koyoharu Gotouge", 24.99));
        booksList.add(new Books(4, "My Hero Academia", "Kohei Horikoshi", 34.99));
        booksList.add(new Books(5, "Attack on Titan", "Hajime Isayama", 14.99));
        booksList.add(new Books(6, "Frieren: Beyond Journey's End", "Kanehito Yamada", 39.99));
        booksList.add(new Books(7, "Fullmetal Alchemist: Brotherhood", "Hiromu Arakawa", 22.99));
        booksList.add(new Books(8, "Hunter × Hunter", "Yoshihiro Togashi", 16.99));
        booksList.add(new Books(9, "Fate", "Kinoko Nasu", 18.99));
    }

    public java.util.List<Books> getBooksList() {
        return booksList;
    }
}
