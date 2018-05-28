
public class Rectangle07 extends GeometricObject07{
	
		private double width;
		private double height;

		public Rectangle07() {
		}

		public Rectangle07(double width, double height) {
			this.width = width;
			this.height = height;
		}

		public Rectangle07(double width, double height, String color, boolean filled) {
			this.width = width;
			this.height = height;
			setColor(color);
			setFilled(filled);
		}


		/** Return width */
		public double getWidth() {
			return width;
		}

		/** Set a new width */
		public void setWidth(double width) {
			this. width = width;
		}

		/** Return height */
		public double getheight() {
			return height;
		}

		/** Set a new height */
		public void setheight(double height) {
			this.height = height;
		}

	
		public double getArea() {
			return width * height;
		}


		public double getPerimeter() {
			return 2 * (width * height);
		}


		public String toString() {
			return super.toString() + "\nWidth: " + width + "\nHeight: " + height
				+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
		}
}
