package sample;
import javafx.application.Application;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
public class Button_using_grid_border extends Application{
    public static void Main(String args[])
    {
            Application.launch(args);
    }
    @Override
    public void start(Stage stage)
    {
        GridPane gird = new GridPane();
        gird.setGridLinesVisible(true);
        gird.setHgap(10);
        gird.setVgap(10);
        //Group g = new Group();


        Button b1  = new Button("First Button");
        Button b2 = new Button("Second Button ");
        Button b3 = new Button("third");
        Button b4 = new Button("fourth");

        GridPane.setConstraints(b1,1,1);
        GridPane.setConstraints(b2,2,1);
        GridPane.setConstraints(b3,1,2);
        GridPane.setConstraints(b4,2,2);

        BorderPane borderpane = new BorderPane();
        borderpane.setTop(new Button("Top"));
        borderpane.setBottom(new Button("Bottom"));
        borderpane.setCenter(new Button("Center"));
        borderpane.setLeft(new Button("left"));
        borderpane.setRight(new Button("Right"));
        GridPane.setConstraints(borderpane,1,3);

        gird.getChildren().addAll(b1,b2,b3,b4,borderpane);
        Scene scene = new Scene(gird,300,300);
        stage.setTitle("Button Using Grid ");
        stage.setScene(scene);
        stage.show();



    }
}
