package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;

public class task04 extends Application{

	public void start(Stage primaryStage) {
		
		StackPane stackPane = new StackPane();
		StackPane stackPane2 = new StackPane();

		
		Pane pane = new Pane();
		stackPane2.setPadding(new Insets(40, 40, 40, 40));

		
		Circle circle = getCircle();
		stackPane.getChildren().add(circle);

		
		Polygon polygon = getPolygon(circle);
		stackPane.getChildren().add(polygon);

		
		Ellipse ellipse1 = getEllipse(circle); 
		ellipse1.setCenterX(circle.getRadius() - circle.getRadius() / 2.5);
		Ellipse ellipse2 = getEllipse(circle); 
		ellipse2.setCenterX(circle.getRadius() + circle.getRadius() / 2.5);

		
		Circle circle2 = getCircle(ellipse1);
		Circle circle3 = getCircle(ellipse2);

	
		Arc arc = getArc(circle);

		
		pane.getChildren().addAll(stackPane, ellipse1, 
			ellipse2, circle2, circle3, arc);

		
		stackPane2.getChildren().add(pane);


		
		Scene scene = new Scene(stackPane2);
		primaryStage.setTitle("Smiley Face"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

	private Arc getArc(Circle c) {
		Arc a = new Arc(c.getRadius(), c.getRadius() * 1.30, 
			c.getRadius() / 2, c.getRadius() / 4, 0, -180);
		a.setType(ArcType.OPEN);
		a.setFill(Color.WHITE);
		a.setStroke(Color.BLACK);
		return a;
	}

	
	private Circle getCircle(Ellipse e) {
		Circle c = new Circle(e.getCenterX(), e.getCenterY(), 
			e.getRadiusY() - (e.getRadiusX() - e.getRadiusY()));
		return c;
	}

	
	private Ellipse getEllipse(Circle c) {
		Ellipse e = new Ellipse();
		e.setCenterY(c.getRadius() - c.getRadius() / 3);
		e.setRadiusX(c.getRadius() / 4);
		e.setRadiusY(c.getRadius() / 3 - 20);
		e.setStroke(Color.BLACK);
		e.setFill(Color.WHITE);
		return e; 
	}

	
	private Polygon getPolygon(Circle c) {
		double length = c.getRadius() / 4;
		Polygon p = new Polygon(c.getCenterX(), c.getCenterY() - length,
			c.getCenterX() - length, c.getCenterY() + length, c.getCenterX() + length, 
			c.getCenterY() + length);
		p.setFill(Color.WHITE);
		p.setStroke(Color.BLACK);
		return p;
	}

	 
	private Circle getCircle() {
		Circle c = new Circle();
		c.setRadius(150);
		c.setStroke(Color.BLACK);
		c.setFill(Color.WHITE);
		return c;
	}
	public static void main(String[] args) {
        launch(args);
    }
}
