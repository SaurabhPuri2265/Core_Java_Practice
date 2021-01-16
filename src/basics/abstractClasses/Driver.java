package basics.abstractClasses;

public class Driver {

    public static void main(String[] args) {

        //Var of class Vehicle pointing to base class Scooter
        Vehicle v1=new Scooter("Road",2000);
        v1.getWorking();

        //Var of class Vehicle pointing to base class airPlane
        Vehicle v2=new airPlane("Flying",5000);
        v2.getWorking();

        //v1 gets info of Scooter
        v1.getInfo();

        //v2 gets info of airplane
        v2.getInfo();

        //v1 and v2 being variable of Vehicle class gets 'speed method' of implementing classes
        v1.speed();
        v2.speed();



    }

}
