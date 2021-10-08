import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class App extends Application{	
	@FXML
    private Button editFormat;

    @FXML
    private Button newFormat;

    @FXML
    private Button useFormat;

    @FXML
    void editFormatScene(ActionEvent event) {
    	
    }

    @FXML
    void newFromatScene(ActionEvent event) throws Exception {
		final String NEW_FORMAT_PATH = "main\\resources\\new-format.fxml";
		Scene newFormatScene = getScene(NEW_FORMAT_PATH);
		getStage(event).setScene(newFormatScene);
    }

    @FXML
    void useFormatScene(ActionEvent event) {

    }
	
	public Scene getScene(String path) throws Exception{
		
		URL url = getClass().getResource(path);
		Parent root = FXMLLoader.load(url);
	    
        Scene startScene = new Scene(root);
        
        return startScene;
	}
	
	public Stage getStage(ActionEvent event) {
		return (Stage)(((Node)event.getSource()).getScene().getWindow());
	}
	
	@Override
	public void start(Stage stage) throws Exception{		
		final String START_SCREEN_PATH = "main\\resources\\start-screen.fxml";
		Scene startScene = getScene(START_SCREEN_PATH);
        
        stage.setScene(startScene);
        stage.show();
	}

	public static void main(String[] args) throws IOException {
		launch(args);

	}
	
	

}
