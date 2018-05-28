import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) throws NumberFormatException {
		
		Scanner in = new Scanner(System.in);
		
		String s=" ";
		System.out.println("Enter a Number 1 :");
		double number1 =in.nextDouble();
		
		System.out.println("Enter a Number 2 :");
		double number2 = in.nextDouble();
		
		System.out.println("Choose an Option\n1.Sum\n2.Divition\n3.Multiplication\n4.Subtraction:");
		int option = in.nextInt();
		
		try {
			switch(option) {
			
			case 1: 
				System.out.println("The Sum is : " +sum(number1,number2));
				break;
			case 2:
				System.out.println("The Divition is: " +div(number1,number2));
				break;
			case 3:
				System.out.println("The Multiplication is : " +mul(number1,number2));
				break;
			case 4:
				System.out.println("The Subtraction is : " +sub(number1,number2));
				break;
			}
	}
	
		catch (NumberFormatException ex) {
            System.out.println("ERROR "+ ex.getMessage());
            System.exit(0);
		}
}

	
	public static double sum(double num1, double num2){
		
			double summation = num1+num2;
		
		return summation;
		
	}
	public static double div(double num1, double num2){
		
		double divition = num1/num2;
	
	return divition;
	}

	   public static double mul(double num1, double num2){
		
		double multipication = num1*num2;
	
	    return multipication;
	}
	public static double sub(double num1, double num2){
	
	   double subtraction = num1-num2;

       return subtraction;
  }
}