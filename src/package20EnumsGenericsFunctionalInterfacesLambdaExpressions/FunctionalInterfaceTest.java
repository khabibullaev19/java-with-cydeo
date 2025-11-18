package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {

        MyFunction<Integer> cube = (a) -> {
            System.out.println(a * a * a);
        };

        cube.function(5);

        MyFunction<Integer> oddOrEven = (a) -> {
            System.out.println((a%2==0)? (a + " is Even") : (a + " is Odd"));
        };
        oddOrEven.function(77);

    }

}
