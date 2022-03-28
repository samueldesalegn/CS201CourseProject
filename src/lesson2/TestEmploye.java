package lesson2;

public class TestEmploye {
	public static void main(String[] args) {
		Employe e = new Employe("Joe", "Smith", 50000);
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		e.setSalary(70000);
		System.out.println(e);
	}
}
