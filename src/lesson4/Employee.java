package lesson4;

public class Employee {
	// Instance Variables
    int id;
    String name;
    int salary;
    // static variable common to all instances
    static int counter = 0;
    
    // Default Constructor
    public Employee () {

    }
    // Parameterized Constructor
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        counter++;
    }

    public int monthlyPayment(){
        int month = this.salary / 12;
        return month;
    }
}
