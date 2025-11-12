package package08stringclass;

public class StringMethods09 {

    public static void main(String[] args) {

        String str = "Java";

        String change1 = str.repeat(4);
        String change2 = str.concat(" ").repeat(4);

        System.out.println(change1);
        System.out.println(change2);

    }

}
