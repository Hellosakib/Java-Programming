import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Task03 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
		
		TextField tfNumber1 = new TextField();
		TextField tfNumber2 = new TextField();       // Create three text field
		TextField tfResult = new TextField();
		
		Button add= new Button("Addition");
		Button sub = new Button("Subtraction");    //Create Buttons
		Button div = new Button("Division");
		Button mul = new Button("Multiplication");
		
	public void start(Stage primaryStage) {
		
			// Create UI
			HBox hBox1 = new HBox(5);
			HBox hBox2 = new HBox(5);
			VBox vBox = new VBox(15);
			
			hBox1.getChildren().addAll(new Label("Number1: "), tfNumber1, new Label("Number2: "), tfNumber2, new Label("Result: "), tfResult);
			hBox2.getChildren().addAll(add, sub, mul, div);
			vBox.getChildren().addAll(hBox1, hBox2);
		
			//Set it row column and center
			hBox1.setAlignment(Pos.CENTER);
			hBox2.setAlignment(Pos.CENTER);
			tfNumber1.setPrefColumnCount(4);
			tfNumber2.setPrefColumnCount(4);
			tfResult.setPrefColumnCount(4);
			tfResult.setEditable(false);
			vBox.setPadding(new Insets(2, 5, 0, 0));
			
			
			/*
			add.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					add();
				}
			});
			
			sub.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					subtract();
				}
			});
			
			mul.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					multiply();
				}
			});
			
			div.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					divide();
				}
			});*/
			
			//This Part only work On Java 8 
			add.setOnAction(e -> add());
			sub.setOnAction(e -> subtract());
			mul.setOnAction(e -> multiply());
			div.setOnAction(e -> divide());	
			
			
			
			// Create a scene and place it in the stage
			Scene scene = new Scene(vBox);
			primaryStage.setTitle("Calculator"); 
			primaryStage.setScene(scene); 
			primaryStage.show();
				
		}

		// Add 
		private void add() {
			tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) +
				Double.parseDouble(tfNumber2.getText())));
		}

		// Subtract 
		private void subtract() {
			tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) -
				Double.parseDouble(tfNumber2.getText())));
		}

		// Multiply 
		private void multiply() {
			tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) *
				Double.parseDouble(tfNumber2.getText())));
		}

		// Divide
		private void divide() {
			tfResult.setText(String.valueOf(Double.parseDouble(tfNumber1.getText()) /
				Double.parseDouble(tfNumber2.getText())));
		}
		
	}



