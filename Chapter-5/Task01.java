import java.util.Scanner;
public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many numbers you define:");
		int n = input.nextInt();
		
		double total=0;
		int count=0 ;
		int downcount=0;
		for(int i =1;i<=n;i++) {
		System.out.println("Enter Numbers: ");
		int num = input.nextInt();
		
		if(num>0)
			count++;
		else if(num<0)
			downcount++;
		else if(num==0)
			System.exit(0);
		
		total += (double) num;

		}
		double average = (double) (total/n);
				
		
		
		System.out.println("The Postitve Number is : " +count);
		System.out.println("The Negative Number is : " +downcount);
		System.out.println("The Total Result is : " +total);
		System.out.println("The Average is: " +average);
	}

}
