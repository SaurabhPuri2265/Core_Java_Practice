package basics.abstractClasses;

//Child class extends base class
public class airPlane extends Vehicle {

    public airPlane(String type, int price) {
        super(type, price);
    }

    @Override
    void getWorking() {
        System.out.println("Airplane is in Sky");
    }
    public void speed(){
        System.out.println("Airplane is very fast");
    }
}
