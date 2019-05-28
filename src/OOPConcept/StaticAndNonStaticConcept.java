package OOPConcept;

public class StaticAndNonStaticConcept {
	
	//global variables -- the scope of global variable will be available across all the functions with some conditions
	
	String name = "Tom"; //non static global variable
	static int age = 25; //static global variable
	
	/*
	 * how can call static method and variables?
	 * direct calling
	 * calling by class name
	 * 
	 * how to call non static and variables?
	 * 
	 */
	public static void main(String[] agrs) {
		
		sum();
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept(); //create the object, given to non static method or variable
		obj.sendMail(); //call non static method
		System.out.println(obj.name); //non static method or variable is not part of the object
		
		//Can I access static methods by using object reference? yes, with a warning
		obj.sum(); //warning will be given (static method sum() from the type StaticAndNonStaticConcept should be accessed in a static way) -- no point to create the object
		sum(); // can direct call
		StaticAndNonStaticConcept.sum(); //or call by class name
		
	}
	
	public void sendMail() { //non static method
		System.out.println("send mail method");
	}
	
	public static void sum() { //static method
		System.out.println("sum method");
	}


}
