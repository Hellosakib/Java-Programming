import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Task04 extends Application{

	public static void main(String[] args) {
		launch(args);

	}
	public void start(Stage primaryStage) {
		 // Create a pane and set its properties
		StackPane pane = new StackPane();
		Text text1 = new Text(20,20,"Java Is Fun " );
		Text text2 = new Text(20,20,"Java is PowerFull");
		pane.getChildren().addAll(text1);
		
		
		/*SomeThing Wrong in this code  :(
		text1.setOnMouseClicked(new EventHandler(){
			public void handle(EventHandler e ) {
				System.out.println("Java is PowerFull");
			}
		});
		
		text2.setOnMouseClicked(new EventHandler<Event>(){
			public void handle(Event e ) {
				System.out.println("Java is Funl");
			}
		});
		*/
		pane.setOnMouseClicked(e -> {
			
			if (pane.getChildren().contains(text1)) {
				pane.getChildren().add(text2);
				pane.getChildren().remove(text1);
			}
			else {
				pane.getChildren().add(text1);
				pane.getChildren().remove(text2);
			}
			
			
		});
	
	
		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setTitle("MouseEvent_Changing Text"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		 }
	
	
	
	
	
	}


