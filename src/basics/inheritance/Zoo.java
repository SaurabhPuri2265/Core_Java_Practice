package basics.inheritance;

//Driver Class
public class Zoo {

    public static void main(String[] args) {

        //Base class obj refering to base class
        Animal A=new Animal("F","ground");
        A.sleep();

        //child class obj refering to child class
        Bird B=new Bird("M","Sky");
        B.fly();
        B.sleep();

        Fish C=new Fish("F","water");
        C.sleep();
        C.swim();


    }
}
