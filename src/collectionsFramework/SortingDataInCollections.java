package collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class SortingDataInCollections {

    public static void main(String[] args) {

        HashSet<Integer> values=new HashSet<>();
        values.add(14);
        values.add(15);
        values.add(16);
        values.add(14);
        values.add(17);  // 14 and 15 are duplicates

        //Using sort function inside collection framework
        //sort methods accepts list as a argument to be sorted
        //Creating a list of hashset data

        ArrayList<Integer> mylist=new ArrayList<>(values);

        System.out.println("-----------Sorting using Collections.sort() function----------");
        //Now using sort function
        Collections.sort(mylist);

        //Printing sorted list
        System.out.println(mylist);

        System.out.println("-------------------Using Comparable Interface to sort-------------------");

        //Using user defined employee obj

        ArrayList<Employee> employees=new ArrayList<>();

        //Adding objects to employees arraylist

        employees.add(new Employee("Saurabh",80000,"Csc"));
        employees.add(new Employee("Aman",60000,"Math"));
        employees.add(new Employee("Jatin",40000,"Phy"));

        Collections.sort(employees);

        System.out.println(employees);


    }
}
