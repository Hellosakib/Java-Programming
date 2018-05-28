package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class task03 extends Application {

	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();


		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int n = (int)(Math.random() * 3);
				if (n == 0)
					pane.add(new ImageView("image/x.gif"), j, i);
				else if (n == 1)
					pane.add(new ImageView("image/o.gif"), j, i);
				else
					continue;
			}
		}


		Scene scene = new Scene(pane, 120, 130);
		primaryStage.setTitle("Tic Tac Toe");
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
	public static void main(String[] args) {
       launch(args);
    }
		
}
