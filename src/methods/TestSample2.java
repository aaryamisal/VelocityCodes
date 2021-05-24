//2. static method call from diffrent/another class

package methods;

public class TestSample2 {
	
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Sample2.m3();
		Sample2.m4();
		TestSample2.m3();
		m3();
		System.out.println("Main Method Ended");
	}

	private static void m3() {
		// TODO Auto-generated method stub
		System.out.println("In same class");
	}

}

