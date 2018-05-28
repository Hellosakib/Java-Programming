import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Task06 extends Application {

	public static void main(String[] args) {
		
		Application.launch(args);

	}
	public void start(Stage primaryStage) {
		// Create a pane
		Pane pane = new Pane();

		// Create and register the handler
		pane.setOnMouseClicked(e -> {
			pane.getChildren().clear();
			
			pane.getChildren().add (new Text(e.getX(), e.getY(), "(" + e.getX() + " , " + e.getY() + ")"));
		});

		
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("The MOuse Movment"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 

	}
}