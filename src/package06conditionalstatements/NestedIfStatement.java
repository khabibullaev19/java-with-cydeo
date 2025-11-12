package package06conditionalstatements;

public class NestedIfStatement {

    public static void main(String[] args) {

        int score = 85;

        if (score >= 1 && score <= 100) {
            if(score >= 60) {
                System.out.println("Passed!");
            }else {
                System.out.println("Failed!");
            }
        }else {
            System.out.println("Invalid score!");
        }

    }

}
