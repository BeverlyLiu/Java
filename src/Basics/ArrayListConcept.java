package Basics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		
		System.out.println(al.size());
		
		al.add(400);
		al.add(500);
		
		System.out.println(al.size());
		
		al.add("Tom");
		al.add("Hello");
		al.add("M");
		al.add(12.33);
		al.add(-100);
		
		System.out.println(al.size());
		System.out.println(al.get(4));
		//System.out.println(al.get(10)); //Index 10 out of bounds for length 10
		
		//to print all the value of arrayList
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(100);
		//al1.add("Tom"); //incorrect data type
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Tom");
		//al1.add(100); //incorrect data type

	}

}
