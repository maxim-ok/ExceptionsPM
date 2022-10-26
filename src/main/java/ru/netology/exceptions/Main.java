package ru.netology.exceptions;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);

        Book book1 = new Book(1, "book", 245, "DIY", "Tom Smith");
        Book book2 = new Book(2, "book", 1400, "War and Peace", "Tolstoy L.N.");
        Book book3 = new Book(3, "magazine", 350, "Auto&moto", "John Collins");


        repository.save(book1);
        repository.save(book2);
        repository.save(book3);


        //repository.findById(1);

        repository.removeById(5);







    }
}
