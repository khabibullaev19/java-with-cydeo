package package19maps;

import javax.management.ObjectName;
import java.util.*;

public class MapDemo {

    /*

        -

     */

    public static void main(String[] args) {

        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("name","Arthur");
        hashMap.put("gender","Male");
        hashMap.put("age","32");

        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name","Arthur");
        linkedHashMap.put("gender","Male");
        linkedHashMap.put("age","32");

        Map<String,Object> hashTable = new Hashtable<>();
        hashTable.put("name","Arthur");
        hashTable.put("gender","Male");
        hashTable.put("age","32");

        Map<String,Object> treeMap = new TreeMap<>();
        treeMap.put("name","Arthur");
        treeMap.put("gender","Male");
        treeMap.put("age","32");

        System.out.println(hashMap);
        System.out.println(linkedHashMap);
        System.out.println(hashTable);
        System.out.println(treeMap);

    }

}
