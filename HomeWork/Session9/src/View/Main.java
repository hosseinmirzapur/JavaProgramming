package View;

import Model.Entity.PersonEntity;
import Model.Service.WorkerService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("WorkerForm.fxml"));
        primaryStage.setTitle("Employment Form");
        primaryStage.setScene(new Scene(root, 607, 790));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
