import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Task02 extends Application {

	public static void main(String[] args) {
		
		Application.launch(args);
	}
	
	BallPane ballpane = new BallPane();
	public void start(Stage primaryStage) {
		
		HBox btn = new HBox(5);
		btn.setSpacing(10);
		btn.setAlignment(Pos.CENTER);
		Button L = new Button("Left");
		Button R = new Button("Right");
		Button U = new Button("Up");
		Button D = new Button("Down");
		btn.getChildren().addAll(L,R,U,D);
		
		//Anonymous
		L.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				ballpane.left();
			}
			
		});
		
		R.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				ballpane.right();
			}
		});
		
		U.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				ballpane.up();
			}
		});
		
		D.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				ballpane.down();
			}
		});
		
		BorderPane pane= new BorderPane();
		pane.setCenter(ballpane);
		pane.setBottom(btn);
		pane.setPadding(new Insets(0, 10, 5, 10));
		
		
		Scene scene = new Scene(pane,400 ,400); 
		primaryStage.setTitle("Move your Ball .....Pane");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
	 	
}

