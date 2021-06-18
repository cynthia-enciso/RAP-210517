package stacktraces;

public class Test {
	public static void main(String[] args) {
		mathInvoker(1, 0);
	}
	public static void mathInvoker(int a, int b) {
		division(a, b);
	}
	public static void division(int a, int b) {
		System.out.println("a / b:" + (a / b));
	} 
}
