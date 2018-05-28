import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;


public class Task07 extends Application {

	public static void main(String[] args) {
		
		Application.launch(args);
	}
	public void start(Stage primaryStage) {
			
		Pane pane = new Pane();
		Polyline line = new Polyline(new Double(200.00) , new Double(200.00));
		
		line.setStroke(Color.BLACK);
		line.setFill(Color.WHITE);
		pane.getChildren().add(line);
		
		ObservableList<Double> list = line.getPoints(); //get the point the value x and y 
		
		pane.setOnKeyPressed(e ->{
			
			double x=0, y=0;
			double length =10;
			
			switch(e.getCode()) {
			
			case DOWN: 
			  x = list.get(list.size() - 2);
			  y = list.get(list.size() - 1) + length; 
			  break;
			case UP: 
			  x = list.get(list.size() - 2);
			  y = list.get(list.size() - 1) - length; 
			  break;
			case RIGHT: 
			  x = list.get(list.size() - 2) + length;
			  y = list.get(list.size() - 1); break;
			case LEFT: 
			  x = list.get(list.size() - 2) - length;
			  y = list.get(list.size() - 1); break;

			}
			
			list.add(x);
			list.add(y); 
			
		});
		

		
		Scene scene = new Scene(pane,500 ,500); 
		primaryStage.setTitle("Move Line");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		pane.requestFocus();
	}

}
