// static method call from same class

package methods;

public class Sample1 {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
		m1();
		m2();
		Sample2.m3();
		Sample2.m4();
		System.out.println("Main Method Ended");
	}

	public static void m1() {
		System.out.println("Hi");
		System.out.println("Hello");
	}
	
	public static void m2() {
		System.out.println("Good Night");
	}
}

