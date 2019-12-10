import javax.swing.*;
import java.util.Scanner;
import java.text.DecimalFormat;
public class SammysRentalPrice {

    static Scanner myScanner;
    static String moneyPattern = "$#,###.00";
    static DecimalFormat moneyFormat = new DecimalFormat(moneyPattern);
    static int iMinutes, cExtraMinutes, cHours;
    static double cCostPerHour, cCostPerMinute, cTotalPrice;
    static String iData, oTotalPrice;

    public static void main(String[] args) {
        input();
        calc();
        output();
    }

    public static void input() {
        myScanner = new Scanner(System.in);

        //get user input
        iData = JOptionPane.showInputDialog(null, "Enter the number of minutes: ",
                "MinutesEntry", JOptionPane.INFORMATION_MESSAGE);

        iMinutes = Integer.parseInt(iData);
    }

    public static void calc() {
        cHours = iMinutes / 60;
        /**
         *Uses Integer Division to get rid of any decimals that would appear
         */
        cCostPerHour = cHours * 40; //$40 per hour
        cExtraMinutes = iMinutes - 60 * cHours;
        /**
         *Takes cHours * 60 to find the total minutes
         */
        cCostPerMinute = cExtraMinutes * 1; //$1 per additional minute
        cTotalPrice = cCostPerHour + cCostPerMinute;
    }
    public static void output() {
        oTotalPrice = moneyFormat.format(cTotalPrice);

        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("Ss" + " " +  "Sammy's makes it fun in the sun." + " " + "Ss");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("For " + cHours + " hour(s) and " + cExtraMinutes + " minute(s), your total is " + oTotalPrice + ".");
    }
}


