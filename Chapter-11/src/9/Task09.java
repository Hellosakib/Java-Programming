import java.util.Scanner;
import java.util.ArrayList;
public class Task09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Create an ArrayList of Integers
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Prompt the user to enter 5 numbers
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}

	
		sort(list);

		
		System.out.println(list.toString());
	}

	
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);		
	}

	

}
