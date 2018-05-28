import java.util.Scanner;
public class LabTask01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] val = new int[10];
		int i ,j ,temp=0;
		Scanner input = new Scanner(System.in);
		
		for (i= 0; i<10; i++) {
			System.out.println("Enter Number in " +i+ " index: ");
			
			val[i]=input.nextInt();			
		}
	
		j = i - 1;  //Now j is the last element
		
	    i = 0;
		while(i<j)
		{
			temp =val[i];
			val[i]=val[j];
			val[j]=temp;
			i++;
			j--;
		}
		for (i = 0; i < 10; i++) {
		     System.out.println("The reverse numbers is : "+val[i]);
		   }
		
	}

}
