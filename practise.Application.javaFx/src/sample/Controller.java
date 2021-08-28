package sample;

import javafx.beans.binding.StringBinding;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableListValue;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.beans.property.ReadOnlyIntegerProperty.readOnlyIntegerProperty;

public class Controller implements Initializable {

    private final Controller1 currrentTask =new Controller1();
    private final ObservableList<Controller1> tasks =  FXCollections.emptyObservableList();
    @FXML
    private ProgressBar taskProgress;

    @FXML
    private TableView<Controller1> taskTable;

    @FXML
    private TableColumn<Controller1 , String> priorityColumn;

    @FXML
    private TableColumn<Controller1 , String> descriptionColumn;

    @FXML
    private TableColumn<Controller1 , Integer> progressColumn;


    @FXML
    private ComboBox<String> taskCombox;

    @FXML
    private TextField taskTextField;

    @FXML
    private Button taskAddButton;

    @FXML
    private Spinner<Integer> taskSpinner;

    @FXML
    private CheckBox taskCheckbox;

    @FXML
    private Button taskCancelButton;

    @Override
    public  void initialize(URL url , ResourceBundle rb)
    {
        taskCombox.getItems().addAll("High","Medium","Low");
        taskSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,100,0));


        taskSpinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                if(t1.intValue()==100)
                {
                    taskCheckbox.setSelected(true);
                }
                else
                {
                    taskCheckbox.setSelected(false);
                }
                currrentTask.setDescription(""+t1.intValue());
               // taskProgress.setProgress(1.0 * t1 / 100);
            }
        });


        ReadOnlyIntegerProperty intProgress =  readOnlyIntegerProperty(taskSpinner.valueProperty());
        taskProgress.progressProperty().bind(intProgress.divide(100.0));
        taskCombox.valueProperty().bindBidirectional(currrentTask.priorityProperty());
        taskTextField.textProperty().bindBidirectional(currrentTask.descriptionProperty());
        taskSpinner.getValueFactory().valueProperty().bindBidirectional(currrentTask.progressProperty());

        taskTable.setItems(tasks);
        priorityColumn.setCellFactory(rowData -> rowData.getValue().priorityProperty());
        descriptionColumn.setCellFactory(rowData -> rowData.getValue().descriptionProperty());
        progressColumn.setCellFactory(rowData -> rowData.getValue().progressProperty());

        StringBinding addButtonTextBinging = new StringBinding() {
            {
                super.bind(currrentTask.idProperty());
            }
            @Override
            protected String computeValue() {
                if(currrentTask.getId()==null)
                {
                    return "Add";
                }
                else
                    return "Update";
            }
        };





    }

}
