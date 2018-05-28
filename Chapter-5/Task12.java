import java.util.Scanner;
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// Report whether the integer is a palindrome.
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
				"a palindrome.");
		
	}	
public static boolean isPalindrome(int number) {
	
	if(reverse(number)==number)
		return true;
	else 
		return false;
	
}
public static int reverse (int number) {
	
	String s1 ="";
	String s = number + "";//covert number to String
	
	for (int i=s.length()-1 ; i>=0 ; i--) {
		s1 += s.charAt(i); //index
		
	}
	int n =  Integer.parseInt(s1); //convert integer from string
		return n;
   }
}
