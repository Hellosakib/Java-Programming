import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Task05 extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}
	public void start(Stage primaryStage) {
		
		StackPane pane = new StackPane();
		Circle cir = new Circle();
		cir.setRadius(100);
		cir.setStroke(Color.BLACK);
		cir.setFill(Color.WHITE);
		
		//The unnecessary Part
		Text label = new Text(500, 500,"Java is Fun!!!");
		
		pane.getChildren().add(cir);
		pane.getChildren().add(label);
		
		
		
		cir.setOnMousePressed(e ->{
			cir.setFill(Color.BLACK);	
			label.setFill(Color.WHITE);
			
		}); 
		
		 cir.setOnMouseReleased(e ->{
			 cir.setFill(Color.WHITE);
				cir.setStroke(Color.BLACK);
				label.setFill(Color.BLACK);
		 });
		
		
		Scene scene = new Scene(pane,500 ,500); 
		primaryStage.setTitle("Circle_Changed_Color");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
