
public class Circle08 extends GeoObject{
	
	private double radius;

	public Circle08() {
	}

	public Circle08(double radius) {
		this.radius = radius;
	}

	public Circle08(double radius, 
		String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override /** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	@Override /** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override /** Implement the toString method in GeometricObject */
	public String toString() {
		return super.toString() + "\nDate created: " + getDateCreated() +
			"\nRadius: " + radius;
	}
}
