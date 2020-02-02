/*
This is a class that demonstrates how to use if statements in Java
1/13/20

 */
public class IfDecisionMaking {
    public static void main(String args[]) {
        int quizScore = 9;
        String statement = "plz do better";
        if (quizScore == 9) {
            System.out.println("You earned a golden star!");
            System.out.println("Congratulations!!");
        }
        else
            System.out.println("I am very disappointed in you... :-(" + "\n" + statement);

        String month = "January";

        if(month.equals("January")) {
            System.out.println("Winter is here");
        }

        if(month.equals("January") && quizScore == 9) {
            System.out.println("What a great start to the New Year!");
        }

        if(month.equals("January") || quizScore == 9) {
            System.out.println("Show off!!!");
        }

    }
}
