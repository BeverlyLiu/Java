package OOPConcept;

public class CallByValAndCallByRef {
	
	int p, q;

	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10, y = 20;
		obj.testSum(x,y); //call by value OR pass by value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	//call by value
	public int testSum(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}
	
	//call by reference
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp = t.p; //temp = 50
		t.p = t.q; //t.p = 60
		t.q = temp; //t.q = 50
		
	}

}
