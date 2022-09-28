package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String name;
    private int year;
    private int series;

    public Car(String name, int year, int series) {
        this.name = name;
        this.year = year;
        this.series = series;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Автомобиль '" + name +
                "' " + year + " года" +
                " серии " + series;
    }

    public static List<Car> getCarsList() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("First", 1901, 1));
        carsList.add(new Car("Second", 1921, 2));
        carsList.add(new Car("Third", 1933, 3));
        carsList.add(new Car("Fourth", 1945, 4));
        carsList.add(new Car("Fifth", 1959, 5));
        return carsList;
    }
}
