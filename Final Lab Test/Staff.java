/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author Sudip
 */
public class Staff extends Employee implements Reportable {

    public Staff(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);
    }

    @Override
    public double calculateSalary() {
        return salary; // অথবা getSalary()
    }

    @Override
    public void generateReport() {
        System.out.println("Monthly Staff Report Generated.");
    }
}
