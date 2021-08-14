package sample;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;

public class Controls extends Application {
    public static void main(String args[]) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setMinWidth(600);
        grid.setMaxHeight(400);

        grid.setVgap(5);
        grid.setHgap(20);
        //grid.setGridLinesVisible(true);

        Label tableArea = new Label("this is where tasks table will come");
        tableArea.setMinWidth(600);
        GridPane.setConstraints(tableArea,1,1,3,1);

        TextField text = new TextField();
        text.setText("Defalut text");
        GridPane.setConstraints(text,2,2);

        ComboBox pr = new ComboBox();
        pr.getItems().addAll("Height" , "Medium" , "Low");
        pr.setPromptText("choose");
        GridPane.setConstraints(pr,1,2);

        Button addButton = new Button("Add");
        addButton.setMinWidth(100);
        GridPane.setConstraints(addButton,1,4);

        Button cancelButton = new Button("Cancel");
        cancelButton.setMinWidth(100);
        GridPane.setConstraints(cancelButton,2,4);

        HBox progress = new HBox();
        progress.getChildren().addAll(new Label("Progress"), new Spinner<Integer>(0,100,0),new CheckBox("Completed"));
        GridPane.setConstraints(progress,1,3,2,1);
        progress.setAlignment(Pos.CENTER_RIGHT);
        progress.setSpacing(10);

        TableView table = new TableView();
        table.setMinWidth(300);
        table.setMaxHeight(250);

        TableColumn c1 = new TableColumn("Priority");
        TableColumn c2 = new TableColumn("Description");
        TableColumn c3 = new TableColumn("Progress");

        table.getColumns().addAll(c1,c2,c3);
        GridPane.setConstraints(table,1,5,2,1);


        grid.getChildren().addAll(table,tableArea,text,pr,cancelButton,addButton,progress);

        Scene scene = new Scene(grid,400,400);
        stage.setTitle("controls");
        stage.setScene(scene);
        stage.show();
    }
}
