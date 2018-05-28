
public class Rectangl10 extends GeometricObject10 implements Comparable<Rectangl10> {
	private double width;
	private double height;

	public Rectangl10() {
	}

	public Rectangl10(
		double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangl10(
		double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

	
	public double getWidth() {
		return width;
	}

	
	public void setWidth(double width) {
		this. width = width;
	}

	
	public double getheight() {
		return height;
	}


	public void setheight(double height) {
		this.height = height;
	}


	public double getArea() {
		return width * height;
	}

	
	public double getPerimeter() {
		return 2 * (width * height);
	}

	public int compareTo(Rectangl10 o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	
	public boolean equals(Object o) {
		return this.compareTo((Rectangl10)o) == 0;
	}


	public String toString() {
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height
			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}