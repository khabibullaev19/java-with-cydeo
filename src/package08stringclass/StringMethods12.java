package package08stringclass;

public class StringMethods12 {

    public static void main(String[] args) {

        String sentence1 = "I love Java and Python programming languages";

        boolean hasJava1 = sentence1.contains("Java");
        boolean hasJava2 = sentence1.toLowerCase().contains("java");

        System.out.println(hasJava1);//true
        System.out.println(hasJava2);//true

    }

}
