package basics;

public class StaticAndInstanceMethods {

    public static void main(String[] args) {

        int result = getSum1(5,5);  //Calling static method

        System.out.println(result);

        //obj of class is created using 'new' keyword
        StaticAndInstanceMethods obj = new StaticAndInstanceMethods();

        result = obj.getSum2(6,6); //Calling Instance with with help of class object

        System.out.println(result);

    }

    //Static Method Declaration
    public static int getSum1(int x1,int x2)
    {
        return x1+x2;
    }

    //Instance Method Declaration
    public int getSum2(int x1,int x2){
        return x1+x2;
    }
}
