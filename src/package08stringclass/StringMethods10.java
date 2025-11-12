package package08stringclass;

public class StringMethods10 {

    public static void main(String[] args) {

        String str1 = "   ";
        String str2 = " #  ";

        System.out.println(str1.isEmpty());//false
        System.out.println(str1.isBlank());//true

        System.out.println(str2.isEmpty());//false
        System.out.println(str2.isBlank());//false

    }

}
