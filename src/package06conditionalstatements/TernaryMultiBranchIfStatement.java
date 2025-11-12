package package06conditionalstatements;

public class TernaryMultiBranchIfStatement {

    public static void main(String[] args) {

        int number = 10;
        String result;

        if (number > 0) {
            result = "Positive";
        } else if (number < 0) {
            result = "Negative";
        }else {
            result = "Zero";
        }
        System.out.println(result);

        System.out.println("-------------------------");

        String result2 = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(result2);

    }

}
