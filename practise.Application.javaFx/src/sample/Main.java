package sample;
import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Main extends Application{
    public  static  void main(String args[])
    {
        // main method used when we want get the value from user
        // like in this example i wanted to get hieght and widht
        //from user of frame
        Application.launch(args);
    }
    @Override
    public void start(Stage stage)
    {
        stage.setTitle("Hello JavaFx");
        //Integer width = Integer.parseInt(getParameters().getNamed().get("width"));
      //  Integer height = Integer.parseInt(getParameters().getNamed().get("height"));

        Group group = new Group(new Button("butn"));
        Scene scene = new Scene(group,200,200);
        stage.setScene(scene);
        stage.show();
    }
}







