package package08stringclass;

public class StringMethods07 {

    public static void main(String[] args) {

        String sentence1 = "Python is cool, I love Python Programming";

        String change1 = sentence1.replaceFirst("Python", "Java");

        System.out.println(change1);
        sentence1 = change1;
        System.out.println(sentence1);

    }

}
