package OOP;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		//USBank.min_bal = 200; //cannot be assigned -- Variables value will not be changed
		
		//USBank b = new USBank(); //cannot instantiate the type USBank
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		System.out.println("----------");

		/*
		 * dynamic polymorphise
		 * child class object can be referred by parent Interface reference variable
		 */
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
	}

}
