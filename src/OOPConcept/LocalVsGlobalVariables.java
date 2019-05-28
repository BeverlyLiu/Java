package OOPConcept;

public class LocalVsGlobalVariables {
	
	/*
	 * Global vars -- class variable
	 */
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		
		int i = 10; //local variable for main method
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name); //use the object to access the variable
		System.out.println(obj.age);
		
	}
	
	public void sum() {
		int i = 15, j = 20, age = 25; //i is a local variable for sum method
		
	}

}
