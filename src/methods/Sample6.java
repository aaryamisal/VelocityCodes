// Method with parameter
package methods;

public class Sample6 {

	public static void main(String[] args) {

		Sample6 s6=new Sample6();
		s6.m9("Aarya");
		s6.add(20, 50);
	}
	
	public void m9(String name) {
		System.out.println(name);
	}
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
}
