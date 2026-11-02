
package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
            getClass().getResource(
                "/fxml/KalkuBMI.fxml"
            )
        );

        Parent root = loader.load();

        // Membuat tampilan aplikasi
        Scene scene = new Scene(root);

        stage.setTitle("Body Mass Index Calculator");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
