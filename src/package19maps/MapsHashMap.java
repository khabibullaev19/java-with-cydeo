package package19maps;

import java.util.HashMap;

public class MapsHashMap {

    public static void main(String[] args) {

        // HashMap -> no order
        // HashTable -> insertion order
        // TreeMap -> natural order

        /*
            1. HashMap is NOT synchronized.
            2. HashMap is NOT multi-thread(thread-safe)
            3. HashMap uses key-value structure (key=must be unique, value=allows duplication)
            4. For keys, you can use "null" values just once in a HashMap.
            5. For values, you can use "multiple null" values.
            6. HashMap is fast.
            7. HashMap does not put elements in any order.
               Elements are in random order.
         */

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100,"Mark");
        hashMap.put(101,"Angie");
        hashMap.put(107,"Brandon Jackson");
        hashMap.put(103,"A");
        hashMap.put(111,"Tom");
        hashMap.put(102,"Angie");
        // If you try to use duplicated keys, java overwrites
        hashMap.put(111,"Carl");
        // If you try to use null twice, it also overwrites.
        hashMap.put(null,"Chris");
        hashMap.put(null,"Charlie");
        // To use multiple null values for values partis allowed.
        hashMap.put(105,null);
        hashMap.put(106,null);
        System.out.println(hashMap);

        System.out.println(hashMap.containsKey(102));
        System.out.println(hashMap.containsValue("Tom"));
        System.out.println(hashMap.containsValue("Carl"));
        System.out.println(hashMap.get(103));

        System.out.println(hashMap.getClass());
        System.out.println(hashMap.get(123));

        System.out.println(hashMap.getOrDefault(123,"There is no key like 123"));

        System.out.println(hashMap.hashCode());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.putIfAbsent(107,"Miami"));
        System.out.println(hashMap);

        hashMap.putIfAbsent(222,"Miami");
        System.out.println(hashMap);

        hashMap.remove(107,"Brandon Jackson");
        System.out.println(hashMap);

        hashMap.remove(101,"Java");
        System.out.println(hashMap);

        // replace() used to update
        hashMap.replace(103,"A","Z");
        System.out.println(hashMap);

        System.out.println(hashMap.size());

    }

}
