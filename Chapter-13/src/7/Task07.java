
public class Task07 {

	public static void main(String[] args) {
	
		Circle07 circle1 = new Circle07(15, "red", true);
		Circle07 circle2 = new Circle07(10, "blue", false);

		
		System.out.println("\nCircle 1: ");
		print(circle1);

		
		System.out.println("\nCircle 2: ");
		print(circle2);

		
		print("\nThe larger of the two circles was ");
		print(Circle07.max(circle1, circle2));

		
		Rectangle07 rectangle1 = new Rectangle07(4, 5, "green", true);
		Rectangle07 rectangle2 = new Rectangle07(4.2, 5, "orange", true);

		
		System.out.println("\nRectangle 1: ");
		print(circle1);

	
		System.out.println("\nRectangle 2: ");
		print(circle2);

	
		print("\nThe larger of the two rectangles was ");
		print(Rectangle07.max(rectangle1, rectangle2));
	}

	private static void print(String string) {
		System.out.println(string);
		
	}

	public static void print(GeometricObject07 geometricObject07) {
		System.out.println(geometricObject07);
	}
	public static void print(GeometricObject o) {
		System.out.println(o);
		
		
	}
}
