import java.util.Scanner;

/**
 * Created 1/9/2020 by Lucas Chapman
 * Asks user for basket type, customer type, accessory type, and state.
 * Uses and creates longabergerProgram object to get and send data to BasketBuild class and call methods from that
 * class.
 */

public class LongabergerProgram {
    // Creates new scanner object
    static Scanner scannerInput = new Scanner(System.in);

    public static void main(String[] args) {

    // Creates longabergerProgram object
    BasketBuild longabergerProgram = new BasketBuild();

    // Passes data stored in BasketBuild object to input()
    input(longabergerProgram);

    // Calls calc from BasketBuild class
    longabergerProgram.calc();

    // Calls receipt() and prints formatted data from BasketBuild class
    System.out.println(longabergerProgram.receipt());
    }

    /**
     * Prompts the user for input data and sends that data to BasketBuild class.
     * @param longabergerProgram
     */

    private static void input(BasketBuild longabergerProgram) {
        String iStr;    // Variables used to contain and user input string data
        char iChar;

        System.out.println("Please enter the basket type: ");
        iChar = scannerInput.nextLine().charAt(0);
        longabergerProgram.setiBasketType(iChar);

        System.out.println("Please enter the accessory type:");
        iStr = scannerInput.nextLine();
        longabergerProgram.setiAccessoryType(iStr);

        System.out.println("Please enter the customer type: ");
        iStr = scannerInput.nextLine();
        longabergerProgram.setiCustomerType(Integer.parseInt(iStr));

        System.out.println("Please enter your state:");
        iStr = scannerInput.nextLine();
        longabergerProgram.setiState(iStr);
    }
}
