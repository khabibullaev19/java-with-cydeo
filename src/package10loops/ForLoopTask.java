package package10loops;

public class ForLoopTask {

    public static void main(String[] args) {

        /*
                Task: Extract Digits, Letters, and Special Characters

                Write a program that retrieves and categorizes the digits, letters, and special characters
                present in a given string.

                Ex:
                    Input:
                            str: "mn@#123Ab!"

                    Output:
                            Letters: "mnAb"
                            Digits: "123"
                            Special Characters: "@#!"
         */

        String str = "mn@#123Ab!";

        String digits = "";
        String letters = "";
        String specialCharacters = "";

        for (int i = 0; i <= str.length()-1; i++) {

            char eachCharacter = str.charAt(i);

            if (eachCharacter >= 48 && eachCharacter <= 57) {
                digits += eachCharacter;
            }else if (eachCharacter >= 'A' && eachCharacter <= 'Z') {
                letters += eachCharacter;
            }else if (eachCharacter >= 'a' && eachCharacter <= 'z') {
                letters += eachCharacter;
            }else {
                specialCharacters += eachCharacter;
            }

        }

        System.out.println("Digits: " + digits);
        System.out.println("Letters: " + letters);
        System.out.println("SpecialCharacters: " + specialCharacters);

    }

}
