package carPractice;

import java.util.Objects;

public class Vehicle {

    private double price;
    private String make;
    private String model;

    public Vehicle(double price, String make, String model) {
        this.price = price;
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.price, price) == 0 && make.equals(vehicle.make) && model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, make, model);
    }
}
