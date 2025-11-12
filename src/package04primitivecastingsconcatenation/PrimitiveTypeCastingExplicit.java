package package04primitivecastingsconcatenation;

public class PrimitiveTypeCastingExplicit {

    public static void main(String[] args) {

        /*
              Explicit Type Casting:
           -> Casting larger primitive types to smaller primitive types.
           -> Must be done explicitly(manually).
         */

        long x = 1000;
        int y = (int)x;
        System.out.println(y);

        double a = 10.5;
        int b = (int)a;
        System.out.println(b);

    }

}
