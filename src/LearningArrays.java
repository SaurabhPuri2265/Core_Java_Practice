import java.util.Arrays;
import java.util.Scanner;

public class LearningArrays {

    public static void main(String[] args) {
        //Working with Arrays in Java

        //Intialisation
        //Specifying the size of array is important

        int[] intArr=new int[10]; // 10 is the size of array which is of integer type

        String[] strArr=new String[5]; // 5 is te size of String type Array

        //Static assignment of values through index position of arrays

        intArr[0]=1;  // At 1st pos
        strArr[1]="Hello There"; //At 2nd pos

        //To Print elements of arrays
        System.out.println(intArr[4]);
        System.out.println(strArr[2]);

        //Printing whole array
        //Use toString() method
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(strArr));

        //Getting user input for Arrays
        //We use Scanner class for this
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<intArr.length;i++)
            intArr[i]=sc.nextInt(); // index i of the array will be assigned with the user specific value

        System.out.println(Arrays.toString(intArr));
    }

}
