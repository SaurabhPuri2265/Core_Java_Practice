package basics.Interface;

public class Ceo extends Person implements Role{

    public Ceo(String name, int age) {
        super(name, age);
    }

    @Override
    public void getRole() {
        System.out.println("Manages the Company");
    }
}
