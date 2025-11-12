package package19maps;

import java.util.*;

public class ProjectForMap {

    public static void main(String[] args) {

        /*
            1. Create a list for color codes.
            2. Create a list for color names.
            3. Match the color codes with color names.
            4. Print code and colors like: lightsalmon = rgb(255,160,122)
                Note: work with 7 colors.
         */

        List<String> codes = new ArrayList<>();
        codes.addAll(Arrays.asList("rgb(255,160,122)"
                                    ,"rgb(250,128,114"
                                    ,"rgb(233,150,122)"
                                    ,"rgb(240,128,128)"
                                    ,"rgb(205,92,92)"
                                    ,"rgb(220,20,60)"
                                    ,"rgb(178,34,34)"));

        List<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("lightsalmon"
                                    ,"salmon"
                                    ,"darksalmon"
                                    ,"lightcoral"
                                    ,"indianred"
                                    ,"crimson"
                                    ,"firebrick"));

        Map<String,String> colorsCodes = new TreeMap<>();
        for (int i=0;i<codes.size();i++) {
            colorsCodes.put(colors.get(i),codes.get(i));
        }
        System.out.println(colorsCodes);

    }

}
