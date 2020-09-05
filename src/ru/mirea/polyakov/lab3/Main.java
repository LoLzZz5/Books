package ru.mirea.polyakov.lab3;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Портрет Дориана Грея", 608);
        Book b2 = new Book("Рождественская песнь в прозе");
        b2.setNumber_of_pages(160);
        b1.output();
        System.out.print(b2);
    }
}
