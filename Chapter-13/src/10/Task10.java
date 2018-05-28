
public class Task10 {

	public static void main(String[] args) {
				
		Rectangl10 r1 = new Rectangl10(3, 5, "blue", true);
		Rectangl10 r2 = new Rectangl10(5, 3, "gray", false);
		Rectangl10 r3 = new Rectangl10(3.1, 5, "blue", true);

		System.out.println("Rectangle1 Area :" + r1.getArea());
		System.out.println("Rectangle2 Area :" + r2.getArea());
		System.out.println("Rectangle3 Area :" + r3.getArea());

		System.out.println("Rectangle1 is " + (r1.equals(r2) ? "" : "not ") +
			"equal to Rectangle2");

		System.out.println("Rectangle1 is " + (r1.equals(r3) ? "" : "not ") +
			"equal to Rectangle3");
	}
}

