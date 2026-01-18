import ru.netology.java.Author;
import ru.netology.java.Book;

public class Main {
    public static void main (String[] args) {
        // создадим пару авторов
        Author author1 = new Author("Fyodor", "Dostoevsky", 5);
        Author author2 = new Author("William", "Shakespeare", 4);
        Author author3 = new Author("Agatha", "Christie", 5);

        // создадим пару книг
        Book book1 = new Book("Crime and Punishment",1866, 527, author1);
        Book book2 = new Book ("The Brothers Karamazov", 1880, 560, author1);
        Book book3 = new Book ("The Phoenix and the Turtle", 1601, 67, author2);
        Book book4 = new Book("Murder on the Orient Express", 1934, 256, author3);

        // тестируем метод isBig()
        System.out.println("----------------");
        System.out.println("Is " + book1.title + " big: " + book1.isBig());
        System.out.println("Is " + book2.title + " big: " + book2.isBig());
        System.out.println("Is " + book3.title + " big: " + book3.isBig());
        System.out.println("Is " + book4.title + " big: " + book4.isBig());
        System.out.println("----------------");
        // тестируем метод matches()
        System.out.println("Search for a word 'Fyodor' in book1: "+ book1.matches("Fyodor")); //positive
        System.out.println("Search for a word 'snake' in book2: "+ book2.matches("snake")); //negative
        System.out.println("Search for a word 'Turtle' in book3: "+ book3.matches("Turtle")); //positive
        System.out.println("Search for a word 'Christie' in book3: "+ book4.matches("Christie")); //positive
        System.out.println("----------------");
        // тестируем расчет стоимости книги
        System.out.println("Book1 estimated price is: " + book1.estimatePrice());
        System.out.println("Book2 estimated price is: " + book2.estimatePrice());
        System.out.println("Book3 estimated price is: " + book3.estimatePrice());
        System.out.println("Book4 estimated price is: " + book4.estimatePrice());
        System.out.println("----------------");
    }
}
