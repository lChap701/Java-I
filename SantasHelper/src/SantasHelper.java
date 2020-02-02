import java.util.Scanner;

/**
 * Calculate the subtotals and total bill of two toys using Toys class
 */

public class SantasHelper {
    static Scanner scannerInput = new Scanner(System.in);

    public static void main(String[] args){
        //toys object
        Toys toysInfo = new Toys();
        //passes the information stored in toysInfo
        input(toysInfo);
        toysInfo.calcs();
        System.out.println(toysInfo.display());
        // calls classname to access class
        Toys.holiday = "Happy Holidays!!!!!";
        System.out.println(Toys.holiday);
    }

    private static void input(Toys toysInfo) {
        String iFirstName, iLastName, iToyName1, iToyName2;
        double iToyPrice1, iToyPrice2;

        System.out.println("Please enter the child's first name:");
        iFirstName = scannerInput.nextLine();
        toysInfo.setiFname(iFirstName);

        System.out.println("Please enter the child's last name:");
        iLastName = scannerInput.nextLine();
        toysInfo.setiLName(iLastName);

        System.out.println("Please enter the name of the toy that will be purchased:");
        iToyName1 = scannerInput.nextLine();
        toysInfo.setiFToyName(iToyName1);

        System.out.println("Please enter how much the toy costs:");
        iToyPrice1 = scannerInput.nextDouble();
        toysInfo.setiFToyPrice(iToyPrice1);

        System.out.println("Please enter the name of the toy that will be purchased:");
        iToyName2 = scannerInput.nextLine();
        toysInfo.setiSToyName(iToyName2);

        System.out.println("Please enter how much the toy costs:");
        iToyPrice2 = scannerInput.nextDouble();
        toysInfo.setiSToyPrice(iToyPrice2);
    }
}
