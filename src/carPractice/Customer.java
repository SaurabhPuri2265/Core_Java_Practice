package carPractice;

public class Customer {
    private String name;
    private String address;
    private double cashOnhand;

    public Customer(String name, String address, double cashOnhand) {
        this.name = name;
        this.address = address;
        this.cashOnhand = cashOnhand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnhand() {
        return cashOnhand;
    }

    public void setCashOnhand(double cashOnhand) {
        this.cashOnhand = cashOnhand;
    }

    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance){
            emp.handleCustomer(this,finance,vehicle);
    }
}
