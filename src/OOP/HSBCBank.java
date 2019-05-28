package OOP;

public class HSBCBank implements USBank, BrazilBank { //achieving multiple inheritance - is a relationship
	
	//if a class implementing any Interface, then its mandatory to define/override all the methods of Interface.
	
	//overriding from US Bank
	public void credit() { //override method
		System.out.println("HSBC -- credit");
	}
	
	public void debit() { //override method
		System.out.println("HSBC -- debit");
	}
	
	public void transferMoney() { //override method
		System.out.println("HSBC -- transferMoney");
	}
	
	//Separate method of HSBC Bank class
	public void educationLoan() {
		System.out.println("HSBC -- Education Loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC -- Car Loan");
	}
	
	//Overriding from Brazil Bank
	public void mutualFund() {
		System.out.println("HSBC -- mutual fund");
	}

}
