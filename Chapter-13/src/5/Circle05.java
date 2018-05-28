
public class Circle05 extends GeoObject05 {

	private double radius;
	
	Circle05(){
		
	}
	Circle05(double radius){
		this.radius = radius;
	}
	public Circle05(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	public double getArea() {
		return radius * radius * Math.PI;
	}

}
