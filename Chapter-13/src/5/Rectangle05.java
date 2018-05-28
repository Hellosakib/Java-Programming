
public class Rectangle05 extends GeoObject05 {

	private double width;
	private double height;

	public Rectangle05() {
	}

	public Rectangle05(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle05(double width, double height, String color, boolean filled) {
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

}
