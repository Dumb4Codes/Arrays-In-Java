
public class Z7_Array {

	public static void main(String[] args) {
		
		// Array = used to store multiple values in single variable
		
		String[] cars = {"camaro","corvette","BMW"};
		
		cars[1] = "Ferrari";
		
		System.out.println(cars[1]);
		
		// OR we can use
		
		String[] Electronics = new String[3];
		Electronics[0]= "tv";
		Electronics[1]= "mobile";
		Electronics[2]= "laptop";
		
		
		
		// For printing String in for loop we use stringname.length
		
		for(int i = 0; i<Electronics.length; i++) {
			System.out.println(Electronics[i]);
		}
				
		

	}

}
