import java.util.Locale;

public class Car {
    private String mark;
    private String model;
    private String color;
    private boolean additionalOptions;



    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", additionalOptions=" + additionalOptions +
                '}';
    }

    public String getColor() {
        return color;
    }


    public String getModel() {
        return model;
    }


    public boolean isAdditionalOptions() {
        return additionalOptions;
    }


    public String getMark() {
        return mark;
    }

    public Car(String mark, String model, String color, boolean additionalOptions) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.additionalOptions = additionalOptions;
    }
//    public Car(CarBuilder carBuilder) {
//        this.mark = carBuilder.getMark();
//        this.model = carBuilder.getModel();
//        this.color = carBuilder.getColor();
//        this.additionalOptions = carBuilder.isAdditionalOptions();
//    }
}

