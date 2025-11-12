package package06conditionalstatements;

public class TernaryOperator {

    public static void main(String[] args) {

        int score = 75;

        // 1:
        String result1;
        if (score >= 60) {
            result1 = "Passed!";
        }else {
            result1 = "Failed!";
        }
        System.out.println(result1);

        // 2:
        String result2;
        result2 = (score >= 60) ?  "Passed!" : "Failed!";
        System.out.println(result2);

        // 3:
        System.out.println((score >= 60) ?  "Passed!" : "Failed!");

    }

}
