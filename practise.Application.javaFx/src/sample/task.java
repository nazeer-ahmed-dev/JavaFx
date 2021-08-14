package sample;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class task {
    public static void main(String args[])
    {
        SimpleIntegerProperty intprop = new SimpleIntegerProperty(); //read write property
        intprop.set(10);
        System.out.println(intprop.get());

        SimpleStringProperty stringProp = new SimpleStringProperty("Heloo");
        System.out.println(stringProp.get());
        stringProp.set("Nazeer Ahmed Here");
        System.out.println(stringProp.get());

        ReadOnlyBooleanWrapper readOnlyBooleanWrapper = new ReadOnlyBooleanWrapper();
        ReadOnlyBooleanProperty readOnlyBooleanProperty = readOnlyBooleanWrapper.getReadOnlyProperty();

        System.out.println(readOnlyBooleanProperty.get());
        readOnlyBooleanWrapper.set(false);
        System.out.println(readOnlyBooleanProperty.get());


    }

}
