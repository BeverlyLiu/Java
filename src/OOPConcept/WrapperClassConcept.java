package OOPConcept;

public class WrapperClassConcept {
	
	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//data convertion -- String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		/*Integer, Double, Character, Boolean
		 * String to double conversion
		 */
		String y = "12.33";
		double j = Double.parseDouble(y);
		System.out.println(j+20);
		
		//String to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to String conversion
		int l = 200;
		System.out.println(l+20);
		
		String s = String.valueOf(l);
		System.out.println(s+20);
		
		String u = "100A";
		int m = Integer.parseInt(u);
		System.out.println(m); //NumberFormatException -- for input String "100A"
		
	}

}
