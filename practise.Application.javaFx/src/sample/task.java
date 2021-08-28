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

        // uni directional binding
        SimpleStringProperty lastNameProp = new SimpleStringProperty();
        SimpleStringProperty sunNameProp = new SimpleStringProperty();
        sunNameProp.bind(lastNameProp); // uni directionaly binding

        lastNameProp.set("Ahmed");
       // sunNameProp.set("hh"); error : bound value can not be set
        System.out.println(sunNameProp.get());

        //Bi-directional binding
        SimpleStringProperty lastNameProp1 = new SimpleStringProperty();
        SimpleStringProperty sunNameProp1 = new SimpleStringProperty();
        sunNameProp1.bindBidirectional(lastNameProp1);
        lastNameProp1.set("a");
        sunNameProp1.set("b");

        System.out.println(lastNameProp1); // output : b
        System.out.println(sunNameProp1);  // output : b





    }

}
