package package08stringclass;

public class StringMethods13 {

    public static void main(String[] args) {

        String url = "www.amazon.com";

        boolean r1 = url.startsWith("www.");
        boolean r2 = url.startsWith("abc");

        System.out.println(r1);//true
        System.out.println(r2);//false

        boolean r3 = url.endsWith(".com");
        boolean r4 = url.endsWith("www");

        System.out.println(r3);//true
        System.out.println(r4);//false

    }

}
