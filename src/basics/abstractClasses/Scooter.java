package basics.abstractClasses;

//Child class extends base class
public class Scooter extends Vehicle{

    public Scooter(String type, int price) {
        super(type, price);
    }

    @Override
    void getWorking() {
        System.out.println("Scooter is on Road");
    }

    public void speed(){
        System.out.println("Scooter is not so fast");
    }
}
