package com.project.Task11;

class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this("Unknown", "Anonymous", 0.0); // calls the full constructor
        System.out.println("Book 1 created with default values.\n");
    }

    public Book(String title, String author) {
        this(title, author, 0.0); // reuses full constructor
        System.out.println("Book 2 created with partial info.\n");
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;

        if (price < 0) {
            System.out.println("Invalid price. Setting to 0.");
            this.price = 0;
        } else {
            this.price = price;
        }

        System.out.println("Book 3 created with full info.");
        display();
    }

    public void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java Basics", "John Doe");
        Book book3 = new Book("Advanced Java", "Jane Smith", -50.0);
    }
}
