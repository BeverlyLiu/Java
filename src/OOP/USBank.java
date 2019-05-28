package OOP;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	/*
	 * only method declaration -- no method body -- only method prototype
	 * Interface -- we can declare the variables, variables are by default static in nature
	 * Variables value will not be changed, its final/constant in nature
	 * No static/main method in Interface
	 * Can not create the object of Interface
	 * Interface is abstract in nature
	 */

}
