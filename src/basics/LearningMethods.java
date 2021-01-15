package basics;

public class LearningMethods {

    public static void main(String[] args) {

        //Calling user defined static function from main method

        //--------------------------------Void methods-----------------------------------

        //No Arg Method call
        PrintStuff();

        //One Arg Method call
        oneArg("Hello");


        //One Arg method call with different argument type
        oneArg(34);

        //Multiple Arg method call
        mulArg("Hello","World");

        mulArg("Hello",5);

        //---------------------- Methods with return type---------------------------

        int x = getAdditon(5,6);

        System.out.println("Added number is : "+x);


    }

    //User Methods

    //With No Arguments
    public static  void PrintStuff(){
        System.out.println("Printing Statement");
    }

    //With one argument with String Argument
     static void oneArg(String arg){
        System.out.println(arg);
    }


    //With one argument with Integer Argument
    public static void oneArg(int arg){
        System.out.println(arg);
    }

    //With multiple arguments with same arg type
    public static void mulArg(String arg1,String arg2){
        System.out.println(arg1+":"+arg2);
    }


    //With multiple arguments with diff arg type
    public static void mulArg(String arg1,int arg2){
        System.out.println(arg1+arg2);
    }

    //Method with int return type returns the sum of number n1 and n2
    public static int getAdditon(int n1,int n2)
    {
        return n1+n2;
    }
}
