public class Task01 {

	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle(4,40);
		Rectangle obj2 = new Rectangle (3.5 , 35.9);
		
		System.out.println("For First Rectangle:");
		System.out.println("Width is:" +obj1.getWidth());
		System.out.println("Height is:" +obj1.getHeight());
		System.out.println("The Area is: " +obj1.getArea());
		System.out.println("The Perimeter is:" +obj1.getPerimeter());
		
		System.out.println();
		
		System.out.println("For Second Rectangle:");
		System.out.println("Width is:" +obj2.getWidth());
		System.out.println("Height is:" +obj2.getHeight());
		System.out.println("The Area is: " +obj2.getArea());
		System.out.println("The Perimeter is:" +obj2.getPerimeter());

	}

}
