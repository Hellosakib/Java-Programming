import java.util.Scanner;
public class LabTask05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double[] num= new double[10];
		System.out.println("Enter 10 values: ");
		
		for(int i=0;i<10;i++) {
		
		num[i] = input.nextDouble();
		}
		System.out.printf("Total is %,.2f\n",mean(num)); 
		System.out.printf("The Standard Deviation is %,.5f",deviation(num));
		
	}
	
public static double deviation(double[] x){
	double deviation = 0;
	double mean = mean(x);
	for (int i=0;i<10;i++) {
		deviation += Math.pow(x[i] - mean, 2);
	}
	return Math.sqrt(deviation / (x.length - 1));
	}


public static double mean(double[] x){
	
	double sum=0;
	double mean;
	for(int i=0;i<10;i++) {
		sum+=x[i];	
	   }
	mean = sum/x.length;
	return mean;
	}
}
