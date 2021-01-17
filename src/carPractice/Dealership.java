package carPractice;

public class Dealership {

    public static void main(String[] args) {

        Customer cust1=new Customer("Tom","123 Anything St.",10000);

        Vehicle vehicle=new Vehicle(10000,"Accord","Honda");

        Employee emp=new Employee();

        cust1.purchaseCar(vehicle,emp,false);

        Vehicle car = new Vehicle(10000,"Accord","Honda");

        boolean value = car.equals(vehicle);
        System.out.println(value);
    }
}
