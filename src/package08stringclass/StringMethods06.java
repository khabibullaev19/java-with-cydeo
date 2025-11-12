package package08stringclass;

public class StringMethods06 {

    public static void main(String[] args) {

        String sentence1 = "Python is cool, I love Python Programming";

        String change1 = sentence1.replace('a', 'b');
        String change2 = sentence1.replace("Python", "Java");

        System.out.println(change1);
        System.out.println(change2);
        System.out.println(sentence1);

    }

}
