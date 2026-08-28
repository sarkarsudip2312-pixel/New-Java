/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author Sudip
 */
public class main {

    public static void main(String[] args) {

        Employee emp1 = new Faculty(101, "Dr. Rahman", 60000, 10000);
        Employee emp2 = new Staff(102, "Mr. Karim", 35000);

        System.out.println("Faculty Information");
        emp1.displayInfo();
        System.out.println("Salary = " + emp1.calculateSalary());

        System.out.println();

        System.out.println("Staff Information");
        emp2.displayInfo();
        System.out.println("Salary = " + emp2.calculateSalary());

        System.out.println();

        // Interface reference
        Reportable r = (Reportable) emp1;
        r.generateReport();
        r = (Reportable) emp2;
        r.generateReport();
    }
}
