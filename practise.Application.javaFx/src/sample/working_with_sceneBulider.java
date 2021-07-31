package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class working_with_sceneBulider extends Application{
    public static void main(String args[])
    {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception
        {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            stage.setTitle("HeLlo world");
            stage.setScene(new Scene(root,300,275));
            stage.show();
        }
}
