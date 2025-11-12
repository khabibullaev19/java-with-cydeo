package package13wrapperClassesArrayListCollectionsUtility;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        byte a = 10;

        //automatically
        Byte b = a;

        //Manual
        Byte c = new Byte(a);

        System.out.println(c);

        //Integer d = a; -> cannot convert Byte to Integer

        Double z = 2.5;
        double x = z;
        System.out.println(x);

    }

}
