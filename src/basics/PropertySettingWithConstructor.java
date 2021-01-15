package basics;

public class PropertySettingWithConstructor {

    public static void main(String[] args) {

        //Creating the objects of class 'Person'

        Person p1=new Person(15,"Sam");
        Person p2=new Person(20,"Aman");

        p1.showDetails();

        p2.showDetails();

    }
}

class Person{
    int age;
    String name;

    //Defined Parametrised Constructor to set the properties of class object
    //'THIS' keyword refers to class variables;
    Person(int age,String name){
        this.name=name;
        this.age=age;
    }

    void showDetails()
    {
        System.out.println("Name is: "+name+" and age is: "+age);
    }
}
