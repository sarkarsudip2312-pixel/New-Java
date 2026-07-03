/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagment1;

/**
 *
 * @author Sudip
 */
import java.util.ArrayList;

public class LibraryManagment1{

    public static void main(String[] args) {

        ArrayList<LibraryItem> items = new ArrayList<>();

        items.add(new Book("B101", "Java Programming", "James Gosling", 650));
        items.add(new Magazine("M205", "Science Today", "Editorial Board", 58));
        items.add(new DVD("D310", "Artificial Intelligence", "Documentary Studio", 120));

        for (LibraryItem item : items) {

            item.displayInfo();

            // Interface methods
            Borrowable b = (Borrowable) item;
            b.borrowItem();

            System.out.printf("Late Fee (7 days): $%.2f%n",
                    item.calculateLateFee(7));

            b.returnItem();

            System.out.println("--------------------------------------");
        }
    }
}