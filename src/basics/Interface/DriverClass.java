package basics.Interface;

public class DriverClass {

    public static void main(String[] args) {

        //Initialising Manager class obj
        Manager m=new Manager("Sumit",19);

        //Initialising Ceo class obj
        Ceo c=new Ceo("Saurabh",24);

        //gets implemented method in manager class
        m.getRole();

        //gets implemented method in ceo class
        c.getRole();
    }
}
