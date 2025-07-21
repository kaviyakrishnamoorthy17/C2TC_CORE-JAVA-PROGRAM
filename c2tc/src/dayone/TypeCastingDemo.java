package dayone;

public class TypeCastingDemo {
	public static void main(String[] args) {
	     // Widening (Implicit casting)
	     int i = 100;
	     double d = i; // int to double

	     // Narrowing (Explicit casting)
	     double d2 = 123.456;
	     int i2 = (int) d2; // double to int

	     System.out.println("Widening Casting (int to double): " + d);
	     System.out.println("Narrowing Casting (double to int): " + i2);
	 }

}
