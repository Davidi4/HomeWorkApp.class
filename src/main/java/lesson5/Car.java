package lesson5;

public class Car {
    private String color;
    private int year;
    private String model;

    public Car(String color, int year, String model) {
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}

