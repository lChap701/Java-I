import java.util.Scanner;

/**
 * This program was created by Lucas Chapman on 12/18/2019
 * This program will ask for a beach name, quantity and cost of snow cones purchased and the same for corn dogs purchased.
 */

public class BeachBumsProgram {
    static Scanner scannerInput = new Scanner(System.in);

    public static void main(String[] args) {
    //creates Beach object
    Beach beachBums = new Beach();

    //passes data stored in Beach object to input() method
    input(beachBums);

    //calls calc from Beach class
    beachBums.calc();

    //calls and prints/displays receipt() method
    System.out.println(beachBums.receipt());
    }

    /**
     * Prompts the user and gets input data
     * @param beachBums
     */
    private static void input(Beach beachBums) {
        String iStr;

        System.out.println("Please enter the name of the beach: ");
        iStr = scannerInput.nextLine();
        beachBums.setiBeachName(iStr);

        System.out.println("Please enter the quantity of snow cones or corn dogs purchased: ");
        iStr = scannerInput.nextLine();
        beachBums.setiSnowConeQty(Integer.parseInt(iStr));

        System.out.println("Please enter the cost of snow cones or corn dogs purchased: ");
        iStr = scannerInput.nextLine();
        beachBums.setiSnowConePrice(Double.parseDouble(iStr));

        System.out.println("Please enter the quantity of snow cones or corn dogs purchased: ");
        iStr = scannerInput.nextLine();
        beachBums.setiCornDogQty(Integer.parseInt(iStr));

        System.out.println("Please enter the cost of snow cones or corn dogs purchased: ");
        iStr = scannerInput.nextLine();
        beachBums.setiCornDogPrice(Double.parseDouble(iStr));
    }
}
