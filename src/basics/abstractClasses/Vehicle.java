package basics.abstractClasses;

//Abstract Parent class
//Can have both abstract and non abstract methods
abstract class Vehicle {

    String type;
    int price;

    Vehicle(String type,int price){
        this.type=type;
        this.price=price;
    }

    public void getInfo()
    {
        System.out.println("Vehicle type is: "+type+" and Price is: "+price);
    }

    public void speed(){
        System.out.println("Speed Not Mentioned");
    }

    abstract void getWorking();

}


