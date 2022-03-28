package lesson2;

public class Employe {
	// Instance Variables
	private String firstName;
	private String lastName;
	private double salary;
	// Constructor
	public Employe(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "FirstName=" + firstName + ", LastName=" + lastName + ", Salary=" + salary;
	}
	
}
