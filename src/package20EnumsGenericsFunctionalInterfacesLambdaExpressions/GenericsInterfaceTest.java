package package20EnumsGenericsFunctionalInterfacesLambdaExpressions;

public class GenericsInterfaceTest {

    public static void main(String[] args) {

        MyFunction<Integer> displayCube = (a) -> {
            System.out.println(a * a * a);
        };

        displayCube.function(100);

        MyFunction<String> thirdCharacter = a -> System.out.println("Third Character is " + a.charAt(2));

        thirdCharacter.function("Cydeo");

    }

}
