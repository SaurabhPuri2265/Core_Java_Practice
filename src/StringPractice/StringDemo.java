package StringPractice;

public class StringDemo {

    public static void main(String[] args) {

        String a="hello";

        //Print String
        System.out.println(a);

        //Determine length of string using inbuilt function
        System.out.println(a.length());

        //White spaces are also count as a character in string
        a="hello   ";

        //Output new length with white spaces
        System.out.println(a.length());

        a="Intellij";

        //Accessing characters at the indices through inbuilt functions
        System.out.println(a.charAt(1)); //Outputs character at pos 1 in given string

        //Extracting substring from a string using 'substring' function
        // substring(i,j+1) ---> i-starting index,j-Ending index
        System.out.println(a.substring(0,5));



    }
}
