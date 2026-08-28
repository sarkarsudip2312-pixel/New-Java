/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author Sudip
 */


class Faculty extends Employee implements Reportable {

    private double allowance;

    public Faculty(int employeeId, String employeeName,
                   double salary, double allowance) {
        super(employeeId, employeeName, salary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return salary + allowance;
    }

    @Override
    public void generateReport() {
        System.out.println("Monthly Faculty Report Generated.");
    }
}
