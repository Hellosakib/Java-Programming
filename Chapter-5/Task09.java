import java.util.Scanner;
public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// Create Scanner
				Scanner input = new Scanner(System.in);

				// Prompt the user to enter a decimal integer
				System.out.print("Enter a decimial interger: ");
				int decimal = input.nextInt();

				// Convert the decimal number to a binary number
				String binary = "";	 // Holds the binary value
				//Calculate the Binary number
				for (int i = decimal; i > 0; i /= 2) {
					binary = (i % 2) + binary; 
				}

				// Display the corresponding binary value of the decimal integer
				System.out.println(
					"The binary value of the decimial \"" + decimal + "\" is: " + binary);
			
	}

}
