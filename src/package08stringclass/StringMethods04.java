package package08stringclass;

public class StringMethods04 {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        int index1 = str.indexOf("a");// first appearance
        System.out.println(index1);

        int index2 = str.indexOf("a ");// second appearance
        System.out.println(index2);

        int index3 = str.indexOf("amm");// third appearance
        System.out.println(index3);

    }

}
