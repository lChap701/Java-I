import javax.swing.*;
import java.text.DecimalFormat;

public class KDRCaculator {
    public static  String iData;
    public static int iKills;
    public static int iDeaths;
    public static double cKDR;

    public static void main(String[] args){
        new KDRSplashDisplay(); //void just gets called, cannot return values
        input();
        calcs();
        output();
    }

    public static void output() {
        String pattern = "##.00";
        DecimalFormat df = new DecimalFormat(pattern);
        JOptionPane.showMessageDialog(null, "Your KDR is " + df.format(cKDR),
                "Get Good", 1);
    }

    public static void calcs() {
        // be sure to cast int to double
        cKDR = (double)iKills / iDeaths;
    }

    public static void input() {
        //get kills and convert
        iData = JOptionPane.showInputDialog(null, "Enter your number of kills: ",
                "Kill Entry", 1);
        iKills = Integer.parseInt(iData);

        //get deaths and convert
        iData = JOptionPane.showInputDialog(null, "Enter your number of deaths: ",
                "Deaths Entry", 1);
        iDeaths = Integer.parseInt(iData);
    }

    //public static void displaySplash() {//public means everyone can see it, private is the opposite
        //JOptionPane.showMessageDialog(null, "'Sup gamers, let's determine how lame your gaming " +
          //              "skills really are", "We Live in a Society", 1);
    }
//}
