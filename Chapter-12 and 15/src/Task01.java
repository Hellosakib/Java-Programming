import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Task01 extends Application{

	public static void main(String[] args) {
		
		Application.launch(args);

	}
	public void start(Stage primaryStage) {
		
		//Create a Rectangle
		Rectangle rec = new Rectangle();
		rec.setX(100);
		rec.setY(100);
		rec.setWidth(100);
		rec.setHeight(50);
		rec.setStroke(Color.BLACK);
		rec.setFill(Color.WHITE);
		
		
		//Create a Button;
		Button rotate = new Button("Rotate");
		BorderPane pane = new BorderPane();
		pane.setCenter(rec);
		pane.setBottom(rotate);
		BorderPane.setAlignment(rec, Pos.CENTER);
		BorderPane.setAlignment(rotate, Pos.CENTER);
		pane.setPadding(new Insets(6, 6, 6, 5));
		
		//anonymous class 
		rotate.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e ) {
				rec.setRotate(rec.getRotate()+15);
			}
		});
		
		//Create a Scene
		Scene scene = new Scene(pane,500 ,500); 
		primaryStage.setTitle("Rectangle");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}

	
