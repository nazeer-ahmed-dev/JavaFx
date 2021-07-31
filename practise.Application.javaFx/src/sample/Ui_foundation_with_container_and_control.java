package sample;
import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
public class Ui_foundation_with_container_and_control extends Application{
    public static  void main(String args[])
    {
                Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception
    {
        Group g = new Group();
        Button b1 = new Button("First");
        Button b2 = new Button("Second");
        b1.setLayoutX(50);
        b1.setLayoutY(15);
        g.getChildren().addAll(b1,b2);

        //g.getChildren().add(new Button("First button"));

        Scene scene = new Scene(g,300,300);
        stage.setScene(scene);
        stage.setTitle("GUI using JavaFx");
        //stage.setAlwaysOnTop(true); always on the top of IDEa
        //stage.setResizable(false);  user cant incerase or decrease the size of frame
        stage.show();
    }
}
