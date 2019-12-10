import javax.swing.*;

public class GUICalcExampleWithMethods {
    //global variables
    static final double TUITION_RATE = 185;
    public static void main(String[] args){
        String iName;
        int iCredits;
        double totalOwed;
        init();         //call the init method
        iName = inputName();        //call the input name method
        iCredits = inputCredits();  //call the input credits method
        totalOwed = calcs(iCredits);        //call the calc method
        output(iName, iCredits, totalOwed);       //call the output method
    }

    /**
     * javadoc comment
     * The init method creates a welcome message
     */
    public static void init(){
        /*JOptionPane.showMessageDialog(null, "Welcome to IHCC Tuition Calculator",
                "Welcome", JOptionPane.INFORMATION_MESSAGE);*/
        HelperMethods.DisplayWelcome();

    }

    /**
         * Prompts for name and return name
         */
        public static String inputName(){
            String iName;
            //get name
            iName = JOptionPane.showInputDialog(null, "Enter student name:");

        return iName;
    }

    /**
     * Prompts for credits and returns credits
     */
    public static int inputCredits(){
        int iCredits;
        //get credits and convert to integer
        String strCredits;
        strCredits = JOptionPane.showInputDialog(null, "Enter number of credits:");
        iCredits = Byte.parseByte(strCredits);

    return iCredits;


    }

    /**
     * Calculate tuition (credits * tuition rate)
     */
    public static double calcs(int iCredits) {
        double totalOwed;
        totalOwed = TUITION_RATE * iCredits;
        return totalOwed;
    }

    public static void output(String iName, int iCredits, double totalOwed) {
        JOptionPane.showMessageDialog(null, "Hello " + iName + ", " + iCredits +
                        " credits will cost you $" + totalOwed,
                "Pay Up!", JOptionPane.INFORMATION_MESSAGE);

    }
}