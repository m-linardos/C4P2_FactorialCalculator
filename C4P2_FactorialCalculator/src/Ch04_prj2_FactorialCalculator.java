import java.util.Scanner;
public class Ch04_prj2_FactorialCalculator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		
	///Welcome
	System.out.println("Welcome to the Factorial Calculator");
 
	while (choice.equalsIgnoreCase("y")) {	
		
		//Prompt
		System.out.println("Enter an integer that's greater than 0 and less than 10: ");
		int getnumber = sc.nextInt();
		
		long fact = 1L;
				
		for (int i = 1; i<=getnumber; i++) {
			fact = (fact*i);	 
//			System.out.println("fact: " + fact);
		}
		System.out.println("The factorial of " + getnumber + " is " + fact);

	//Bye
		System.out.print("Continue? (y/n): ");
        choice = sc.next();       
	}
	 System.out.println("Bye");

	}
}
	