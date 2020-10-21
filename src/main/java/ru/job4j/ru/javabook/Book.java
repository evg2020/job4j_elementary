package ru.job4j.ru.javabook;

public class Book {
    String name;
    String author;
    public static void main(String[] args) {
        Book first = new Book();
        first.name = "Остров капитанов";

        Book[] myBooks = new Book[3];
        myBooks[0] = new Book();
        myBooks[1] = new Book();
        myBooks[2] = new Book();

        myBooks[0].name = " Сорви голова";
        myBooks[1].name = " Голова проф Доуля";
        myBooks[2].name = " Чел Неведимка";

        int x = 0;
        while (x<3) {
            System.out.println(myBooks[x].name);
            x = x + 1;
        }
    }
}
