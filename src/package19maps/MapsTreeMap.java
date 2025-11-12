package package19maps;

import java.util.Map;
import java.util.TreeMap;

public class MapsTreeMap {

    public static void main(String[] args) {

        /*
            1. TreeMap puts the elements in natural order according to the keys.
            2. TreeMap is not synchronized and not thread safe.
            3. TreeMap does not allow null keys, but allows multiple null values.
            4. TreeMap is slow.
         */

        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(27,"Good");
        treeMap.put(15,"Bad");
        treeMap.put(50,"Ugly");
        treeMap.put(25,"The Best");
        treeMap.put(30,"The Worst");

        //Does not accept null as a key, gives NullPointerException
        //treeMap.put(null,"Wooow");

        treeMap.put(11,null);
        treeMap.put(13,null);

        System.out.println(treeMap);

        treeMap.computeIfAbsent(15,k->"Pretty");
        System.out.println(treeMap);

        treeMap.computeIfAbsent(33,k->"Pretty");
        System.out.println(treeMap);

    }

}
