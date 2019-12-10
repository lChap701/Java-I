import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Total {
    static Scanner myScanner;
    static String pattern = "$###,###.##";
    static DecimalFormat moneyFormat = new DecimalFormat(pattern);
    static Double iCharge, cTip, cTax, cTotal;
    static String iData, oTip, oTotal, oTax, oCharge;

    public static void main(String[] args) {
        input();
        calcs();
        output();
    }

    public static void input(){
        myScanner = new Scanner(System.in);

        //get user input
        iData =JOptionPane.showInputDialog(null,"Enter your charge: ",
            "ChargeEntry",JOptionPane.INFORMATION_MESSAGE);

        iCharge =Double.parseDouble(iData);

    }
    public static void calcs() {
        cTip = .15 * iCharge;
        cTax = .07 * iCharge;
        cTotal = cTip + cTax + iCharge;
    }

    public  static void output() {
        //format and display
        oTotal = moneyFormat.format(cTotal);
        oTax = moneyFormat.format(cTax);
        oTip = moneyFormat.format(cTip);
        oCharge = moneyFormat.format(iCharge);

        System.out.println("Your total is " + oTotal);
        System.out.println("Your tax is " + oTax);
        System.out.println("Your tip is " + oTip);
        System.out.println("Your charge is " + oCharge);
    }
}
