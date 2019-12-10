import java.util.Scanner;

public class Eggs {

    static int iEggs, cDozen, cIndividualEggs;
    static double cDozenEggsCost, cIndividualEggsCost, cTotal;
    static Scanner myScanner;

    public static void main(String[] args) {

    myScanner = new Scanner(System.in);

    System.out.println("Enter the number of eggs purchased: ");
    iEggs = myScanner.nextInt();

    cDozen = iEggs / 12;
    cDozenEggsCost = 3.25 * cDozen;
    cIndividualEggs = iEggs - cDozen * 12;
    cIndividualEggsCost = 0.45 * cIndividualEggs;
    cTotal = cIndividualEggsCost + cDozenEggsCost;

    System.out.println("You ordered " + iEggs + "." + " That's " + cDozen + " dozen eggs at $3.25 per dozen and " + cIndividualEggs + " loose eggs at 45 cents each egg for a total of $" + cTotal + ".");
    }
}


