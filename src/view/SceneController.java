package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchScene1(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchLogin(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
	public void switchCadastroEmpresa(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("CadastroEmpresa.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
	public void switchCadastroPessoa(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("CadastroPessoa.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
	public void switchCadastroVaga(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("CadastroVaga.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
	public void switchPerfilPessoa(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("PerfilPessoa.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
	public void switchPerfilEmpresa(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("PerfilEmpresa.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	//public void switchInicial(ActionEvent event) {
		
	//}
	

}
