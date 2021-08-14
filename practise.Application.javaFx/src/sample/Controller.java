package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ProgressBar taskProgress;

    @FXML
    private TableView<?> taskTable;

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
                taskProgress.setProgress(1.0 * t1 / 100);
            }
        });
    }

}
