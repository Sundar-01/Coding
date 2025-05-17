package com.project.Task11;

class Book{
    protected String title;
    protected String author;
    protected int price;

    public Book(){
        this.title = "Unknown";
        this.author = "Anonymous";
        this.price = 0;   
    }
    public Book(String title, String author){
        this.title = "Java Basics";
        this.author = "John Doe";
    }
    public Book(String title, String author, int price){
        this.title = "Java Basics";
        this.author = "John Doe";
        this.price = 0;
    }
}