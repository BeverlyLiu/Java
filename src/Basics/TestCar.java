package Basics;

import OOP.BMW;
import OOP.Car;

public class TestCar {
	
	public static void main(String[] args) {
		
		//static polymorphise -- compile time polymorphise
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine(); //from super(Vehicle) class
		
		System.out.println("----------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("----------");
		
		/*child class object can be referred by parent class reference variable
		 * call dynamic polymorphise -- run time polymorphise
		 * Top Casting
		 */
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting
		//BMW b1 = new Car(); //No, it is not allowed
		BMW b1 = (BMW)new Car(); //a warning will be given -- ClassCastException
		
		
	}

}
