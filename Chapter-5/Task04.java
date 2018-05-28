import java.util.Scanner;
public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		 
		int max = 0; 
		  int secondMax = 0;
		  String maxName = "";
		  String secondMaxName = "";		
		  
		System.out.println("Enter How Many numbers of Student's you want to: ");		
		int n = input.nextInt();	
		
		   for(int i=1; i<=n;i++) {
			
			System.out.println("Enter Student Name: ");
			String name = input.next();
			
			System.out.println("Enter Student Score: ");
			int score = input.nextInt();
			
			if (score > max) {
			    secondMax = max;
			    //added secondMaxName = maxName; to correct the code. See comment in the post below
			    secondMaxName = maxName; 
			    max = score;
			    maxName = name;
			   } 
			
			else if (score > secondMax) {
			    secondMax = score;
			    secondMaxName = name;
			   }
			
		}
		  System.out.println("The student with the highest score is " + maxName+ " " +max);
		  System.out.println("The student with the second highest score is " + secondMaxName+ "" +secondMax);
		
		
	}

}
