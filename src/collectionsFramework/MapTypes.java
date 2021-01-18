package collectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTypes {
    public static void main(String[] args) {

        System.out.println("---------------------------HashMap--------------------------------");

        //Defining hashmap with key->String and value->String
        //HashMap stores pairs in unordered way
        HashMap<String,String> dict = new HashMap<>();

        //putting key-value pair in map
        dict.put("Saurabh","Puri");
        dict.put("Deepak","Kumar");
        dict.put("Aditya","Thakur");
        dict.put("Sahil","Nishal");

        //Traversing keys of a map
        for(String str:dict.keySet())
            System.out.println(str);

        //Traversing values of a map
        for(String str:dict.values())
            System.out.println(str);

        //Traversing both key-value at once
        for(Map.Entry<String,String> entry:dict.entrySet())
            System.out.println(entry.getKey()+":"+entry.getValue());


        System.out.println("-----------------------------Linked Hashmap---------------------------");

        //Linked Hashmap is similar to Hashmap
        //It stores pairs in ordered way in which the data is inserted
        LinkedHashMap<String,String> linkmap=new LinkedHashMap<>();

       linkmap.put("Saurabh","Puri");
        linkmap.put("Deepak","Kumar");
        linkmap.put("Aditya","Thakur");
        linkmap.put("Sahil","Nishal");

        //Traversing both key-value at once
        for(Map.Entry<String,String> entry:linkmap.entrySet())
            System.out.println(entry.getKey()+":"+entry.getValue());


        System.out.println("----------------------------TREE-MAP------------------------------");

        //Same as hashmap but stores pairs in sorted manner
        TreeMap<String,String> treeMap=new TreeMap<>();
        treeMap.putAll(linkmap);


        //Traversing both key-value at once
        for(Map.Entry<String,String> entry:treeMap.entrySet())
            System.out.println(entry.getKey()+":"+entry.getValue());




    }
}
