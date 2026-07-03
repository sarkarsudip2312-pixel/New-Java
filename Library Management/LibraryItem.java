/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagment1;

/**
 *
 * @author Sudip
 */
public abstract class LibraryItem {

    protected String id;
    protected String title;
    protected String publisher;

    public LibraryItem(String id, String title, String publisher) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
    }

    public abstract void displayInfo();

    public abstract double calculateLateFee(int days);
}
