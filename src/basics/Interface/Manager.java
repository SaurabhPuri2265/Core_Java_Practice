package basics.Interface;

public class Manager extends Person implements Role{

    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void getRole() {
        System.out.println("Manages the team...");
    }
}
