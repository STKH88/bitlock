package ru.netology.java;

public class Author {
    public String name;
    public String surname;
    public int rating;
    // создадим констркуктор класса для инициализиации объектов класса
    public Author (String name, String surname, int rating) {
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }
}
