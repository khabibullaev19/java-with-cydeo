package package08stringclass;

public class StringObjects {

    public static void main(String[] args) {

        String str1 = "Java"; // String literal
        String str2 = "Java"; // String literal

        System.out.println(str1 == str2);

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3 == str1);
        System.out.println(str3 == str4);

    }

}
