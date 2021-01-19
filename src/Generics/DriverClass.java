package Generics;

import java.util.HashSet;
import java.util.Set;

public class DriverClass {

    public static void main(String[] args) {

        Container<Integer,String> container = new Container<>(12,"Hello");

        int var1 = container.getItem1();
        String var2 = container.getItem2();

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(5);

        Set<Integer> resultSet=union(set1,set2);

        System.out.println(resultSet);
    }
    public static <E> Set<E> union(Set<E> set1,Set<E> set2)
    {
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
