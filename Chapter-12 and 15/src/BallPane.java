import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;



//Ball Pane Class
public class BallPane extends Pane{
		
		Circle cir = new Circle(20,20,50);
			
		
		public BallPane() {
			cir.setCenterX(100);
			cir.setCenterY(100);
			cir.setStroke(Color.BLACK);
			cir.setFill(Color.WHITE);
			getChildren().add(cir);
		}
		
		// X-axis
		public void left() { 
			cir.setCenterX(cir.getCenterX() > cir.getRadius() ? cir.getCenterX() - 20 : cir.getCenterX()); //If Center is bigger then radius 
			cir.setCenterY(cir.getCenterY());
		}
		
		public void right() {
			cir.setCenterX(cir.getCenterX() < getWidth() - cir.getRadius() ? cir.getCenterX() + 20 : cir.getCenterX()); //If Radius is bigger then Center
			cir.setCenterY(cir.getCenterY());
		}
		
		//Y-axis
		public void up() {
			cir.setCenterX(cir.getCenterX());
			cir.setCenterY(cir.getCenterY() > cir.getRadius() ? cir.getCenterY() - 20 : cir.getCenterY());
		}
		public void down() {
			
			cir.setCenterX(cir.getCenterX());
			cir.setCenterY(cir.getCenterY() < getHeight() - cir.getRadius() ? cir.getCenterY() + 20 : cir.getCenterY());
		
		}
}