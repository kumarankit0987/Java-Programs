package com.w3resource_OOPs;

import java.util.ArrayList;

public class Example05 {
    public static void main(String[] args) {
        Book book1 = new Book("Java for Beginners","Ankit","9867353535");
        Book book2 = new Book("Python Language Book","Ankit","764364373");

    }
}
class Book{
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book> bookList = new ArrayList<Book>();

    public Book(String title,String author,String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }

    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }

    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    public String getISBN(){
        return ISBN;
    }

    public static  void addBook(Book book){
        bookList.add(book);
    }
    public static void removeBook(Book book){
        bookList.remove(book);
    }
}
