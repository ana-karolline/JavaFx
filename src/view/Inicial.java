package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Inicial extends Application {



	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
			Scene scene = new Scene(root);
			
			stage.setScene(scene);
			stage.setTitle("OpenJobs");
			stage.show();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	 
	public static void main(String[] args) {
		launch(args);
		System.out.println("java version: "+System.getProperty("java.version"));
	}

}
