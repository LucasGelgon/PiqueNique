package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomePageController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Model model;
	
	public void set_model(Model model) {
		this.model = model;
	}
	
	public void FeedPoll_button(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void MyPolls_button(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("MyPolls.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void MyAccount_button(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("AccountPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void Logout_button(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("ConnectionPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	

}
