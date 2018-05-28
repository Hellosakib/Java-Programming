
public abstract class GeometricObject07 implements Comparable<GeometricObject07> {
	
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject07() {
		dateCreated = new java.util.Date();
	}


	protected GeometricObject07(String color , boolean filled) {
		dateCreated = new java.util.Date();
		this.color=color;
		this.filled= filled;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}


	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
			" and filled: " + filled;
	}

	
	public int compareTo(GeometricObject07 o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	public static GeometricObject07 max(GeometricObject07 o1, GeometricObject07 o2) {
		return o1.compareTo(o2) == 1 ? o1 : o2;
	}

	//abstract method
	public abstract double getArea();
	public abstract double getPerimeter();
	
	
}
