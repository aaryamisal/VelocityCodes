//3. non-static method call from same class
package methods;

public class Sample3 {

	public static void main(String[] args) {
		System.out.println("Main Class Started");
		Sample3 s3= new Sample3();
		s3.m5();
		s3.m6();
		
		System.out.println("Main Class Ended");

	}

	public void m5() {
		System.out.println("Running non static method from same class: m5");
	}
	
	public void m6() {
		System.out.println("Running non static method from same class: m6");
	}
}

