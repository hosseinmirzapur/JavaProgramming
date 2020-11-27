package view;

import controller.UserController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Entity;

public class Controller {
    public TextField username;
    public PasswordField password;
    public Button lgnBtn;
    public void login(ActionEvent actionEvent)throws Exception{
        if(username.getText().equals("")||password.getText().equals("")||username.getText().contains(" ")||password.getText().contains(" ")){
            System.out.println("A problem found during entry!");
            System.out.println("Reload the website!");
            System.exit(1);
        }
        else{
            Stage stage=(Stage) lgnBtn.getScene().getWindow();
            stage.close();
            Stage primaryStage=new Stage();
            DialogPane root= FXMLLoader.load(getClass().getResource("Success.fxml"));
            Scene scene=new Scene(root,360,90);
            primaryStage.setScene(scene);
            primaryStage.show();
        }

    }
    public Button btn2;
    public TextField name1;
    public TextField username1;
    public TextField password1;
    public TextField email1;
    public void signupBtn(ActionEvent actionEvent)throws Exception{
        Entity entity=new Entity();
        UserController userController=new UserController();
        userController.entry(entity);
    }
    public DialogPane ok;
    public Button loginMain;
    public Button signupMain;
    public void suMain(ActionEvent actionEvent)throws Exception {
        Stage stage=(Stage) signupMain.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        DialogPane root= FXMLLoader.load(getClass().getResource("Signup.fxml"));
        Scene scene=new Scene(root,600,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void lgnMain(ActionEvent actionEvent) throws Exception{
        Stage stage=(Stage) loginMain.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        DialogPane root= FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene=new Scene(root,600,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
