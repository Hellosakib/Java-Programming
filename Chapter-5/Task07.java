public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum =0;
		
		for(double i=1 ; i<=97 ; i+=2) {
			
			sum += i/(i+2);		
			
		}
		System.out.printf("The Sum of the Series is : %,.6f ",sum);
		
		}

}