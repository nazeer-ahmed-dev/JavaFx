package sample;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.*;

public class task1 {
    public static void main(String args[])
    {
        StringProperty firstName = new SimpleStringProperty();
        StringProperty lastName = new SimpleStringProperty();
        StringProperty surName = new SimpleStringProperty();
        surName.bind(lastName);  // uni-directional
        lastName.set("Ahmed");
        System.out.println(surName.get());

        firstName.set("Nazeer");

        StringProperty fullName = new SimpleStringProperty();
        fullName.bind(Bindings.concat(firstName," ",lastName));
        System.out.println(fullName.get());


        IntegerProperty length = new SimpleIntegerProperty(18);
        IntegerProperty width = new SimpleIntegerProperty(13);

        IntegerProperty area = new SimpleIntegerProperty();
        area.bind(length.multiply(width));

        NumberBinding perimeter = length.add(width).multiply(2);
        System.out.println(area.get());
        System.out.println(perimeter.getValue());

        DoubleProperty radius = new SimpleDoubleProperty(1.5);
        DoubleBinding volumeBinding = new DoubleBinding() {
            {
                super.bind(radius);
            }
            @Override
            protected double computeValue() {
                return 4/3*Math.pow(radius.get(),3);
            }
        };
        System.out.println(volumeBinding.get());
        radius.set(2.4);
        System.out.println(volumeBinding.get());

    }
}
