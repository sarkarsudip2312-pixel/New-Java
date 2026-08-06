/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagment1;

/**
 *
 * @author Sudip
 */
public class Magazine extends LibraryItem implements Borrowable {

    private int issueNumber;

    public Magazine(String id, String title, String publisher, int issueNumber) {
        super(id, title, publisher);
        this.issueNumber = issueNumber;
    }


    public void displayInfo() {
        System.out.println("Library Item: Magazine");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Issue No: " + issueNumber);
    }


    public double calculateLateFee(int days) {
        return days * 0.20;
    }


    public void borrowItem() {
        System.out.println(title + " has been borrowed.");
    }


    public void returnItem() {
        System.out.println(title + " has been returned.");
    }
}
