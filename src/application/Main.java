package application;
	

import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;



public class Main extends Application {
	
	private static Stage currentStage;
	//public static Connection c;
	
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		try {
			currentStage=primaryStage;
			
			
			FXMLLoader f = new FXMLLoader(Main.class.getResource("viewAuto.fxml"));
			Scene scene = new Scene(f.load());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void setScene(String name) {
		try {
		currentStage.setScene(new Scene(new FXMLLoader(Main.class.getResource(name)).load()));
		currentStage.show();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
