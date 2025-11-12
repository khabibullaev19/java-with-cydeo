package package09custommethods;

public class MethodsTask {

    public static void main(String[] args) {

        /*
                Task: Combine Strings with a Special Rule

                Create a method named combine that takes two strings as arguments, concatenates them together,
                and returns the result.
                However, if the last letter of the first word and the first letter of the second word are same,
                you should return that character only once.

                Ex:
                    combine("one", "eight") ==> "oneight"
         */

        System.out.println(combine("seven", "nine"));

    }

    public static String combine(String a, String b) {
        String result;
        if(a.charAt(a.length()-1) == b.charAt(0)) {
            result = a + b.substring(1);
        }else {
            result = a + b;
        }
        return result;
    }

}
