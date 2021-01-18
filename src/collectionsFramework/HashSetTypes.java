package collectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTypes {
    public static void main(String[] args) {

        //Set is similar to lists but it prevents duplicates

        System.out.println("-----------------------------------HASHSET----------------------------------");

        //Defining hashset of Integer reference type
        //Unordered insertion of elements is followed unlike in Arraylists which follow ordered insertion
        HashSet<Integer> values=new HashSet<>();
        values.add(14);
        values.add(15);
        values.add(16);
        values.add(14);
        values.add(15);  // 14 and 15 are duplicates

        //Traversing the set using for each loop
        for(int value:values)
            System.out.println(value);


        System.out.println("------------------------------LINKED HASHSET-----------------------------");

        //For ordered insertion we use linked hashset
        //Defining linked hashset of Integer reference type
        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(14);
        numbers.add(15);

        //Traversing numbers set using for each loop
        for(int num:numbers)
            System.out.println(num);

        System.out.println("------------Working in hashset with user defined objects-------------");

        //Defining hashset of animal type
        HashSet<Animal> animals=new HashSet<>();

        Animal animal1=new Animal("Dog",12);
        Animal animal2=new Animal("Cat",13);
        Animal animal3=new Animal("Bird",14);
        Animal animal4=new Animal("Dog",12);

        //Add animal objects to created hashset 'animals'
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);

        for(Animal animal:animals)
            System.out.println(animal);

        boolean flag=animal1.equals(animal4);
        System.out.println(flag);
    }
}
