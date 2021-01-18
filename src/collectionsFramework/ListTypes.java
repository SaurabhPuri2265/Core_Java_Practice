package collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTypes {

    public static void main(String[] args) {


        System.out.println("----------------------------------------ARRAY LIST----------------------------------");

        //Arraylist is a raw datatype haivng default size of 10 slots
        //if 11 th item is added a new list is created with double the size and referencing it as the original list
        // <String> --> specifies the type of data arraylist holds mainly holds reference type
        ArrayList<String> list = new ArrayList<>();

        //To add data in the list
        list.add("hello");
        list.add("world");
        list.add("My name is Saurabh");

        //Traversing list using inbuilt get function
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        //Traversing arraylist using for each loop
        for(String s:list)
            System.out.println(s);

        System.out.println("----------------------------------------LINKED LIST----------------------------------");

        //LinkedList class
        //Has data and next reference under the hood
        //better than arraylist in terms of dynamic addition and removal of items
        //slower than arraylist in terms of retrieval of data
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        //Traversing linked list
        //using for each loop
        for(int num:numbers)
            System.out.println(num);

        numbers.removeFirst();

        for(int num:numbers)
            System.out.println(num);


    }
}
