
public class Task05 {

	public static void main(String[] args) {
		
		GeoObject05 cir = new Circle05(1 ,"White", true);
		GeoObject05 rec = new Rectangle05(1,1,"Black",false);
		
		int s= compareGeometricObject(cir ,rec);
		
		if(s==1) {
			System.out.println("The first object is larger than the Second.");
		}
		else if(s==0) {
			System.out.println("Both Area are Equal.");
		}
		else if(s==-1) {
			System.out.println("Both are not Equal.");
		}
			

	}


	public static int compareGeometricObject(GeoObject05 ob1, GeoObject05 ob2) {
		
		double a = ob1.getArea();
		double b = ob2.getArea();
		
		{
		if(a>b)
			
			return 1;
		
		else if(b>a)
			return 2;
		}
		
		if(a==b) {
			return 0;
		}
			else {
				return -1;
			}
		}
	
}
