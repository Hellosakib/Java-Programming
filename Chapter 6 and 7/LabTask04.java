import java.util.Scanner;
public class LabTask04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] distinctNumber = new int[10];
		int count =0;
		
		System.out.println("Enter Any 10 values between 1 to 10 : ");
		for(int i=0; i<distinctNumber.length;i++) {
		 int num =input.nextInt();		
		
		
		if(FindDistinct(distinctNumber, num)) {
			distinctNumber[count]=num;
			count++;
		}
	}
		
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		for (int i = 0; i < distinctNumber.length; i++) {
			if (distinctNumber[i] > 0)
				System.out.print(" " + distinctNumber[i]);
		}
		System.out.println();	
	
	}
public static boolean FindDistinct(int[]arr , int num) {
	
	for (int i=0;i<arr.length;i++) {
		if(num==arr[i])
			return false;
	}
	return true;
	
 	}

}
