public  class CarBuilder {
    private  String mark;
    private String model;
    private String color;
    private boolean additionalOptions;

    public CarBuilder(String mark, String model, String color, boolean additionalOptions) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.additionalOptions = additionalOptions;
    }

    public CarBuilder setMark(String mark) {
        this.mark = mark;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;

    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isAdditionalOptions() {
        return additionalOptions;
    }

    public CarBuilder setAdditionalOptions(boolean additionalOptions) {
        this.additionalOptions = additionalOptions;
        return this;
    }
    public  Car buildCar(){
        return new Car(mark,model,color,additionalOptions);
    }
}
