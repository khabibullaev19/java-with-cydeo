package package19maps;

import java.util.Hashtable;
import java.util.Map;

public class MapsHashTable {

    public static void main(String[] args) {

        /*
            1. HashTable uses key-value structure.
            2. HashTable is Synchronized.
            3. HashTable is Thread Safe.
            4. HashTable is not ordered.
            5. HashTable, does not use "null" for keys and values.
            6. HashTable is slow according to HashMap.
         */

        Map<String,String> hashTable1 = new Hashtable<>();
        hashTable1.put("Cat","Meow");
        hashTable1.put("Dog","Bark");
        hashTable1.put("Lion","Roar");
        hashTable1.put("Bee","Buzz");
        hashTable1.put("Cow","Moo");

        //If you use "null" for key, you get NullPointerException.
        //hashTable.put(null,"Yell");

        // for value also, it does not accept null
        //hashTable.put("Chicken",null);

        System.out.println(hashTable1);

        System.out.println(hashTable1.keySet());

        Map<String,String> hashTable2 = new Hashtable<>();
        hashTable2.put("C","M");
        hashTable2.put("D","B");
        hashTable2.put("L","R");
        System.out.println(hashTable2);

        // Copies all the mappings from the specified map to this map.
        hashTable1.putAll(hashTable2);
        System.out.println(hashTable1);

    }

}
