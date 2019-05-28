package OOPConcept;

public class FunctionsInJava {

	//main method -- starting point of execution
	public static void main(String[] args) {
		
		/*one object will be created, obj is the reference variable, referring to this object
		 * after creating the object, the copy of all non static methods will be given to this object
		 */
		int x = 15, y=3;
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.pqr();
		obj.qa();
		obj.division(x, y);
		
	}
	
	/*function and method is the same thing
	 * non static methods
	 * void means does not return any value
	 * return type = void
	 */
	public void test() { //no input, no output
		System.out.println("test method");
	}
	
	//return type = int
	public int pqr() { //no input, some output
		System.out.print("PQR method: ");
		int a=10, b=20, c=a+b;
		System.out.println(c);
		return c;
	}
	
	//return type = String
	public String qa() { //no input, some output
		System.out.print("qa method: ");
		String s = "Selenium";
		System.out.println(s);
		
		return s;
	}
	
	/*x,y -- input parameters/arguments
	 * return type = int
	 */
	public int division(int x, int y) {
		System.out.print("division method: ");
		System.out.println(x/y);
		
		return x/y;
	}

}
