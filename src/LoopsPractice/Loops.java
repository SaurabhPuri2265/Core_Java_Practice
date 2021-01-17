package LoopsPractice;

public class Loops {
    public static void main(String[] args) {

        //While Loops

        int count=0;

        //Works till the condition inside the braces is true
        while(count<=10)
        {
            System.out.println("Count is : "+count);
            count+=1; //Incrementing count by 1
        }

        //For loops
        //initial value and condition checking is done in one line in for loop
        for(count=0;count<=10;count++)
        {
            System.out.println("Count is : "+count);
        }

        //Working with Strings in for loop
        String s="hello";

        //getting characters in a string using 'charAt()' function
        for(count=0;count<s.length();count++)
        {
            System.out.println("Character at pos "+count+" is "+s.charAt(count));
        }

        //getting character in a string by treating and converting into char array
        count=0;
        for(char c : s.toCharArray())
        {
            System.out.println("Character at pos "+count+" is "+c);
            count+=1;
        }
    }
}
