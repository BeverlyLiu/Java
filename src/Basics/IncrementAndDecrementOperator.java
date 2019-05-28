package Basics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		//++, --
		int i=1, j=i++, a=1, b=++a, m=2, n=m--, p=2, q=--p;	
		
		System.out.println("i= "+i+", j= "+j);	//post increment
		System.out.println("a= "+a+", b= "+b);	//pre increment
		System.out.println("m= "+m+", n= "+n);	//post decrement
		System.out.println("p= "+p+", q= "+q);	//pre decrement

	}

}
