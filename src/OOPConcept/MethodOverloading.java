package OOPConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
	}
	
	// can overload main method
	public static void main(int p) { // input parameter different
		
	}
	
	public static void main(int m, int n) { // input parameters different
		
	}

	
	/*
	 * can not create a method inside a method
	 * duplicate method -- same method name with same number of arguments are not allowed
	 */
	public void sum() { //0 input parameter
		System.out.println("Sum method -- zero parameter");
	}
	
	public void sum(int i) { //method overloading -- 1 input parameter -- same method diff args
		System.out.println("Sum method -- 1 input parameter");
		System.out.println(i);
	}
	
	public void sum(double d) { //method overloading -- 1 input parameter -- same method diff data type
		System.out.println("Sum method -- 1 input parameter");
		System.out.println(d);
	}
	
	public void sum(int k, int l) { // method overloading -- 2 input parameters -- input parameters within the same class
		System.out.println("sum method -- 2 input parameters");
		System.out.println(k+l);
	}

}
