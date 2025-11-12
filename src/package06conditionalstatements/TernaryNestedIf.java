package package06conditionalstatements;

public class TernaryNestedIf {

    public static void main(String[] args) {

        int score = 85;
        String result;

        if (score >= 0 && score <= 100) {

            if (score >= 60) {
                result = "Passed!";
            }else {
                result = "Failed!";
            }

        }else {
            result = "Invalid score!";
        }
        System.out.println(result);

        System.out.println("---------------------");

        String result2 = (score >= 0 && score <= 100) ?
                                                        (score >= 60) ? "Passed!" : "Failed!" :
                                                                                                "Invalid score!";
        System.out.println(result2);

    }

}
