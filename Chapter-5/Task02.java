public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double val=1.609;   // 1 Miles = 1.609 KiloMeters
		
		System.out.println("Miles\tKiloMeters"); 
		System.out.println("--------------");  
		
		for(int i=1; i<=10; i++)
		{
			double res =val*i;			
			System.out.println(i+ "\t" +res);
		}			
		
	}

}
