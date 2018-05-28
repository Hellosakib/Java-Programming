import java.util.Scanner;
public class task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num = input.nextInt();
		
		
		System.out.println("The Sum of the Digit is: " +sumDigits(num));
		
	}

public static int sumDigits(int n) {
	
	int sum = 0;
	
	while (n > 0) 
	{
		int mod = n%10;
		sum += mod;
		n /= 10;
	}
	
	return sum;
	
  }
	
	
}
