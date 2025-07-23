package assignment2;

public class Main {
	public static void main(String[] args) {
        // Create Student object
        Student student = new Student();

        // Create Commission object and use it
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }

}
