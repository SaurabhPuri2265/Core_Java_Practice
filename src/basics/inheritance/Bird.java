package basics.inheritance;

//Child class extending base class
public class Bird extends Animal{

    public Bird(String gender, String type) {
        super(gender, type);
    }

    public void fly(){
        System.out.println("Flying....");
    }
}
