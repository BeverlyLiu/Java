package Basics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		if(b>a) {
			System.out.println("b is grater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		//comparison operators: < > <= >= !=
		int c = 40, d = 50;
		
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		int a1 = 400, b1 = 200, c1 = 300;
		
		//nested if - else
		if(a1>b1 & b1>c1) {	//false & false = false; true & true = true; true & false = false
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else {
			System.out.println("c1 is the greatest");
		}

	}

}
