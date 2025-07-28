package day7.abstract1;

public class Executor {
	public static void main(String[] args) {
		Coder c1,c2;
		c1=new Student();
		c1.rules();
		c2=new Trainer();
		c2.rules();
	}
}