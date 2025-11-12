package package08stringclass;

public class StringMethods08 {

    public static void main(String[] args) {

        String sentence1 = "I love Java Programming Language";
        // index numbers:   0123456789.......

        String change1 = sentence1.substring(7,11);
        String change2 = sentence1.substring(7);

        System.out.println(change1);
        System.out.println(change2);

    }

}
