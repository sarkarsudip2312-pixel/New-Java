/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagment1;

/**
 *
 * @author Sudip
 */
public class DVD extends LibraryItem implements Borrowable {

    private int duration;

    public DVD(String id, String title, String publisher, int duration) {
        super(id, title, publisher);
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Library Item: DVD");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Producer: " + publisher);
        System.out.println("Duration: " + duration + " minutes");
    }

    public double calculateLateFee(int days) {
        return days * 1.00;
    }

    public void borrowItem() {
        System.out.println(title + " has been borrowed.");
    }

    public void returnItem() {
        System.out.println(title + " has been returned.");
    }
}