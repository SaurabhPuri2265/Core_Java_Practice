package StringPractice;

public class StringComparison {

    public static void main(String[] args) {

        String s1="hello";
        String s2=new String("hello");

        //Using '==' operator to compare Strings
        /*Double equals operator is used to compare two or more than two objects,
         If they are referring to the same object then return true, otherwise return false*/

        if(s1==s2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        //Using 'equals()' function to compare strings
        /*In Java, string equals() method compares the two given strings based on the data / content of the string.
         If all the contents of both the strings are same then it returns true.*/

        if(s1.equals(s2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        //Using 'compareTo()' function to compare strings
        /*It also compares two strings based on the content but returns 0 if both strings are equal in
        content and a non zero integer if they are different*/

        if(s1.compareTo(s2)==0)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

    }

}
