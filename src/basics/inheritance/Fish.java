package basics.inheritance;

//Child class extending base class
public class Fish extends Animal{

    public Fish(String gender, String type) {
        super(gender, type);
    }
    public void swim(){
        System.out.println("Swimming....");
    }
}
