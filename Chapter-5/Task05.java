public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1;
		
		while ((n*n*n)<12000)
		{
			n++;
		}
		System.out.println("Largest integer n such that n^3 is less than 12,000 : " + n);
		
	}

}
