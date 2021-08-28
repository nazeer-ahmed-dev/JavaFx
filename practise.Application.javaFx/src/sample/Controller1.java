package sample;

import javafx.beans.binding.ObjectBinding;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Controller1 {
    StringProperty priority = new SimpleStringProperty();
    StringProperty description = new SimpleStringProperty();
    ObjectProperty<Integer> progress = new SimpleObjectProperty<>(0);

    private  final ObjectProperty<Integer> id = new SimpleObjectProperty<>(null);
    public Controller1()
    {}
    public Controller1(Integer id ,String priority , String descritption , Integer progress)
    {
        this.id.set(id);
        this.priority.set(priority);
        this.description.set(descritption);
        this.progress.set(progress);
    }

    public void setid(Integer value)
    {
        this.id.set(value);
    }
    public Integer getId()
    {
        return this.id.get();
    }
    public ObjectProperty<Integer> idProperty()
    {
        return id;
    }

    public String getPriority() {
        return priority.get();
    }

    public StringProperty priorityProperty() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority.set(priority);
    }

    public String getDescription() {
        return description.get();
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public Integer getProgress() {
        return progress.get();
    }

    public ObjectProperty<Integer> progressProperty() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress.set(progress);
    }
}
