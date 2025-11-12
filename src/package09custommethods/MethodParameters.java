package package09custommethods;

public class MethodParameters {

    public static void main(String[] args) {

        displayCube(5);
        displayCube(10);

    }

    // Create a function that can display the cube of a number
    public static void displayCube(int number) {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is " + cube);
    }

}
