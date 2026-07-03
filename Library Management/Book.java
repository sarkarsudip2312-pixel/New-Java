/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagment1;

/**
 *
 * @author Sudip
 */
public class Book extends LibraryItem implements Borrowable {

    private int pages;

    public Book(String id, String title, String publisher, int pages) {
        super(id, title, publisher);
        this.pages = pages;
    }


    public void displayInfo() {
        System.out.println("Library Item: Book");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + publisher);
        System.out.println("Pages: " + pages);
    }

    public double calculateLateFee(int days) {
        return days * 0.50;
    }
    
    public void borrowItem() {
        System.out.println(title + " has been borrowed.");
    }

    public void returnItem() {
        System.out.println(title + " has been returned.");
    }
}
