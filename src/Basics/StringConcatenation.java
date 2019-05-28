package Basics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		/*
		 * + -- is concatenation operator
		 * println -- is used to print on the console with a new line
		 * print -- is just used to print on the console
		 */
		int a= 100, b = 200;
		double c = 12.33, d = 10.33;
		String x = "Hello", y = "World";
		
		System.out.println(a=b);
		a = 100;
		System.out.println(x+" "+y);
		System.out.println(a+b+" "+x+" "+y);
		System.out.println(a+b+x+y+a+b);
		System.out.println("\nThe value is: "+c+" "+d+'\n');
		System.out.println(x+" "+y+' '+c+" "+d);

	}

}
