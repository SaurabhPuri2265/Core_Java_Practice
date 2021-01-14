package basics;

public class ControlFlows {

    public static void main(String[] args) {

        //Control Flow Statements

        //Using If Else Statements
            //Only one of either block will be executed which will be true

        //------------------------------IF ELSE Flow------------------------------------------------

        int num=5;

        if(num>4){
            System.out.println("Number is Bigger than 4");  // This statement will be executed as num>4
        }
        else{
            System.out.println("Smaller or Equal to 4");
        }

        boolean flag=true;

        if(flag)
            System.out.println("Flag is true");  // As the flag is true this statement is executed
        else
            System.out.println("Flag is false");


        //------------------------------Nested IF Else Flow----------------------------------------------

        num = 4;

        if(num>0 && num<20)
        {
            if(num < 15)
                System.out.println("Number lies between 0 and 15");
            else
                System.out.println("Number lies between 15 and 20");
        }
        else
            System.out.println("Number is Greater than or Equal to 15");



        //-----------------------------Switch Statements-----------------------------------------

        int month=1;

        char mn='A';

        switch (mn)
        {
            case 'A':
                System.out.println("January");
                break;
            case 'B':
                System.out.println("February");
                break;
            default:
                System.out.println("None");

        }


    }
}
