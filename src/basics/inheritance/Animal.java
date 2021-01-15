package basics.inheritance;


//Parent class defination

public class Animal {

    //String action;
    String type;
    String gender;

    Animal(String gender,String type)
    {
        this.gender = gender;
        this.type=type;
    }

    public void sleep(){
        System.out.println("Sleeping....");
    }


}
