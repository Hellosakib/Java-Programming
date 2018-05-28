import java.util.ArrayList;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("Enter How many Elements you want to print:");
		int val = input.nextInt();
			
		ArrayList<Integer> number = new ArrayList<Integer>();
		System.out.println("Enter the elements:");
		for(int i=0;i<val;i++) {			
			int ele = input.nextInt();
			number.add(ele);
		}
		
		System.out.println("You Enter this elements:");
		System.out.println(number);	

	}

}
