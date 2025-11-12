package package13wrapperClassesArrayListCollectionsUtility;

public class WrapperClassTask {

    public static void main(String[] args) {

        /*
            Task: Check for Equal Uppercase and Lowercase Characters

            Write a program that examines a string and returns true if the total number of uppercase characters
            in the string is equal to the total number of lowercase characters.

                Ex:
                    Input String: "JAVA java"

                Output:
                        true
         */

        String str = "JAVA java";

        int countUpper = 0, countLower = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isUpperCase(each)) {
                countUpper++;
            } else if (Character.isLowerCase(each)) {
                countLower++;
            }
        }

        System.out.println("Upper Case: " + countUpper);
        System.out.println("Lower Case: " + countLower);
        System.out.println(countLower == countUpper);

    }

}
