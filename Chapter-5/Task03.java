public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tuition =10000;
		double increase = (100+5)/100;
		int totalcost =0;
		int tenyear=0;
		
		for(int i =1; i<=14; i++) {
			
			tuition*=increase;     //increase by 5%
			
			if(i>10)
			{
				totalcost+=tuition;
			}
			else if(i==10) {
			   tenyear =tuition ;
			}
			
		}
			System.out.println("Tuition in ten years: $" +tenyear);
			
			System.out.println("Total cost for four years' worth of tuition" + " after the tenth year: $" + totalcost);
			
		
	}

}
