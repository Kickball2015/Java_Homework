public class SwitchVariables {
public static void main(String[] args) {
	int a = 10;
	int b = 20;
	System.out.println("Before: a = " + a + " b = " + b);
	int c = a;
	a = b;
	b = c;
	System.out.println("After: a = " + a + " b = " + b);
}
}
