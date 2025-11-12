package package04primitivecastingsconcatenation;

public class PrimitiveTypeCastingImplicit {

    public static void main(String[] args) {

        // Primitive Casting allows us to assign one primitive
        // type value to another primitive type.

        // There are two types of castings:
        // "implicit" and "explicit" castings.

        /*
              Implicit casting:
            -> Casting smaller primitive types to larger primitive types.
            -> Implicitly done by the compiler.
         */

        /*
            Primitives:
            byte < short < int < long < float < double
         */

        int a = 100;
        long b = a;
        System.out.println(b);

    }

}
