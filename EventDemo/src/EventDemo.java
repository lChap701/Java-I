import java.util.Scanner;
import java.text.DecimalFormat;

public class EventDemo {
    public static void main(String[] args){
        int iMinutes = input();
        init();
        process(iMinutes); //calls calc and output
    }

    public static void init() {
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("Ss" + " " +  "Sammy's makes it fun in the sun." + " " + "Ss");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
    }

    public static int input() {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int iMinutes = myScanner.nextInt();
        return iMinutes;
    }

    public static void process(int iMinutes) {
        getcTotalPrice(iMinutes);
        getcExtraMinutes(iMinutes);
        getcHours(iMinutes);
        output(iMinutes);
    }

    public static int getcHours(int iMinutes) {
        int cHours = iMinutes / 60;
        return cHours;
    }

    public static int getcExtraMinutes(int iMinutes) {
        int cHours = getcHours(iMinutes);
        int cExtraMinutes = iMinutes - 60 * cHours;
        return cExtraMinutes;
    }

    public static double getcTotalPrice(int iMinutes) {
        int cHours = getcHours(iMinutes);
        double cCostPerHour = cHours * 40; //$40 per hour
        int cExtraMinutes = getcExtraMinutes(iMinutes);
        double cCostPerMinute = cExtraMinutes * 1; //$1 per additional minute
        double cTotalPrice = cCostPerHour + cCostPerMinute;
        return cTotalPrice;
    }

    public static void output(int iMinutes) {
        int cHours = getcHours(iMinutes);
        int cExtraMinutes = getcExtraMinutes(iMinutes);
        double cTotalPrice = getcTotalPrice(iMinutes);
        String moneyPattern = "$#,###.00";
        DecimalFormat moneyFormat = new DecimalFormat(moneyPattern);
        String oTotalPrice = moneyFormat.format(cTotalPrice);
        System.out.println("For " +  cHours + " hour(s) and " + cExtraMinutes + " minute(s), your total is " +
                oTotalPrice + ".");
    }
}