package Basics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array -- to store similar data type values in a array variable
		//int array -- index=n-1, n is size of array
		//one dim array
		
		/*disadvantages of array
		 * size is fixed -- static array -- to overcome this problem, we use Collections -- ArrayList, HashTable -- use dynamic array
		 * stores only similar data type -- to overcome of this problem, we use Object array
		 */
		
		int i[] = new int[4];
		i[0]=10; i[1]=20; i[2]=30; i[3]=40;
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		System.out.println(i.length); //length of array
		
		//print all the values of array: use loop
		
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		//double array
		double d[] = new double[3];
		d[0]=12.33;
		d[1]=13.44;
		d[2]=45.55;
		
		System.out.println(d[2]);
		
		// char array
		char c[] = new char[3];
		c[0]='q';
		c[1]=2;
		c[2]='$';
		
		//boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		
		//String array
		String s[] = new String[3];
		s[0]="text";
		s[1]="Hello World,";
		s[2]="We are coming!";
		
		System.out.println(s.length);
		System.out.println(s[1] + " " + s[2]);
		
		//Object array (Object is a class) -- is used to store different data types values
		Object ob[] = new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="1/1/1999";
		ob[4]="M";
		ob[5]="London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);

	}

}
