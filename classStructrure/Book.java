package ru.netology.java;
import ru.netology.java.Author;

public class Book {
    public String title;
    public int releaseYear;
    public int pages;
    public Author author;
    //конструктор
    public Book (String title, int releaseYear, int pages, Author author) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = author;
    }
    //методы
    public boolean isBig() {
        if (this.pages > 500) {
            return true;
        }  else {
            return false;
        }
    }
    //
    public boolean matches(String word) {
        if (this.title.contains(word) || this.author.name.contains(word) || this.author.surname.contains(word)) {
            return true;
        } else {
            return false;
        }
    }
    // estimatePrice(), возвращающий оценку стоимости книги (целое число в рублях) по формуле 3 рубля за страницу,
    // но не меньше 250 рублей.
    //Цена книги теперь рассчитывается как 3 рубля за страницу, умноженное на квадратный корень из рейтинга,
    // после чего округлённое вниз, но не меньше 250 рублей. Для вычисления квадратного корня воспользуйтесь командой Math.sqrt,
    // округления вниз - Math.floor с приведением к целому числу - (int) Math.floor(...).
    public int estimatePrice() {
        int price;
        price = (int) Math.floor(this.pages * Math.sqrt(this.author.rating));
        return price;
    }
}
