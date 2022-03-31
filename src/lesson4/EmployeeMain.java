package src.lesson4;

public class EmployeeMain {

    public static void main(String[] args) {

        int x = 5; // Local Variable

        // Employee Object Creation
        Employee emp1 = new Employee(111,"Dean",40000);
        Employee emp2 = new Employee(112, "Zaineh", 120000);
        Employee emp3 = new Employee(113, "Yasmeen", 130000);

        // Assigning Object, both refer the same memory
        Employee emp0 = emp1;
        // Calling non private instance fields
        emp0.name = "Charles";
        // Calling Instance method
        System.out.println(emp3.monthlyPayment());
        // Calling Static field directly using Class name 
        System.out.println("counter is: " + Employee.counter);
        // Calling static method
        print();
    }

    public static void print() {
        int y = 6 ;
        System.out.println(y);
    }
}
