import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
	public Scene getScene(Stage stage, String path) throws Exception{
		
		URL url = getClass().getResource(path);
		Parent root = FXMLLoader.load(url);
	    
        Scene startScene = new Scene(root);
        
        return startScene;
	}
	
	@Override
	public void start(Stage stage) throws Exception{
		final String START_SCREEN_PATH = "main\\resources\\start-screen.fxml";
		Scene startScene = getScene(stage, START_SCREEN_PATH);
        
        stage.setScene(startScene);
        stage.show();
	}

	public static void main(String[] args) throws IOException {
		launch(args);

	}

}
