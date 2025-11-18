package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

import java.util.List;

public class Generics {

    /*
            public static void printEach(Integer[] array) {
                for (Integer each : array) {
                    System.out.println(each);
                }
            }

            public static void printEach(Character[] array) {
                for (Character each : array) {
                    System.out.println(each);
                }
            }

            public static void printEach(Double[] array) {
                for (Double each : array) {
                    System.out.println(each);
                }
            }

            public static void printEach(String[] array) {
                for (String each : array) {
                    System.out.println(each);
                }
            }

     */

    public static <T> void printEach(T[] t) {
        for (T each : t) {
            System.out.print(each + " ");
        }
    }

    public static <T> void printEach(List<T> list) {
        for (T each : list) {
            System.out.print(each + " ");
        }
    }

}
