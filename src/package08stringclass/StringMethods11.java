package package08stringclass;

public class StringMethods11 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("Java");
        String str3 = new String("Java");

        String str4 = new String("JAVA");

        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true
        System.out.println(str2.equals(str3));//true

        System.out.println(str3.equals(str4));//false
        System.out.println(str3.equalsIgnoreCase(str4));//true

    }

}
