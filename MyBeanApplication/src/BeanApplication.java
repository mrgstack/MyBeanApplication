import java.util.*;

public class BeanApplication {

	// Final Value For Our Maximum Number To Count To
	static int MAX_NUMBER = 100;

	// Main Method Will Add Beans To ArrayList And Print Out List 
	public static void main(String[] args) {
		
		
		// Create an ArrayList to Store the Beans
		ArrayList<Bean> beans = new ArrayList<Bean>();
		
		
		// Add Beans to ArrayList
		for(int i=1; i<=MAX_NUMBER; i++){
			// Bean Type X is Black Beans For Prime Numbers
			// Bean Type Y is Red Kidney Beans For Non Prime Numbers
			// If Current Value of i Returns True When Calling isPrime(i), Add a BlackBean to ArrayList beans
			if(isPrime(i)){
				beans.add(new BlackBean(i, "Black Bean"));
			}
			// Else, Add a RedKidneyBean to ArrayList beans
			else{
				beans.add(new RedKidneyBean(i, "Red Bean"));
			}
		}
		
        for(Bean b:beans) {
            System.out.println(b.id);
            System.out.println(b.caption);
            System.out.println("");
        }
	}

	// Method - Check if a Numbed is a prime
	// Prime Numbers - Greater Than 1 That Has No Positive Divisors Other Than 1 and Itself
	// Return true or false when isPrime is Called
	private static boolean isPrime(int value) {
        if (value < 2) return false;				// If <value> is Less Than 2, Not a Prime
        if (value == 2) return true;				// 2 Is Only Equally Divisible By 1 and Itself, Is a Prime
        if (value % 2 == 0) return false;           // If <value> is Equally Divisible by 2(no remainder), Not a Prime 
        // For Any Other Odd Integers Starting at 3, Until We Reach <value> 
        for (int i = 3; i * i <= value; i += 2)
            if (value % i == 0) return false;		// If <value> is Equally Divisible by 2(no remainder), Not a Prime
        return true;								// Else it is a Prime
        }
}
