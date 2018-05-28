import java.util.Scanner;
public class Task08 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] arr = new int[100];
		
		System.out.println("Enter the Index Number that you want to find:");
		
		for(int i =0;i<100;i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		try {
			System.out.println("The Index Element is: " +arr[in.nextInt()]);  // Here what is the element of this index we just print that as like println(arr[4])
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Out Of Bounds....");
		}
	}
}
